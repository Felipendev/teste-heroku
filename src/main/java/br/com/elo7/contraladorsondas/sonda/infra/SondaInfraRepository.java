package br.com.elo7.contraladorsondas.sonda.infra;

import br.com.elo7.contraladorsondas.handler.APIException;
import br.com.elo7.contraladorsondas.sonda.application.repository.SondaRepository;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class SondaInfraRepository implements SondaRepository {
    private final SondaSpringDataJPARepository sondaSpringDataJPARepository;

    @Override
    public Sonda salva(Sonda sonda) {
        log.info("[inicia] SondaInfraRepository - salva");
        sondaSpringDataJPARepository.save(sonda);
        log.info("[finaliza] SondaInfraRepository - salva");
        return sonda;
    }

    @Override
    public List<Sonda> buscaTodasSondas() {
        log.info("[inicia] SondaInfraRepository - buscaTodasSondas");
        List<Sonda> todasSondas  = sondaSpringDataJPARepository.findAll();
        log.info("[finaliza] SondaInfraRepository - buscaTodasSondas");
        return todasSondas;
    }

    @Override
    public Sonda buscaSondaAtravesId(UUID idSonda) {
        log.info("[inicia] SondaInfraRepository - buscaSondaAtravesId");
        Sonda sonda = sondaSpringDataJPARepository.findById(idSonda)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Sonda não encontrada!"));;
        log.info("[inicia] SondaInfraRepository - buscaSondaAtravesId");
        return sonda;
    }

    @Override
    public void deletaSondaAtravesId(Sonda sonda) {
        log.info("[inicia] SondaInfraRepository - deletaSondaAtravesId");
        sondaSpringDataJPARepository.delete(sonda);
        log.info("[finaliza] SondaInfraRepository - deletaSondaAtravesId");
    }
}
