package br.com.elo7.contraladorsondas.sonda.application.service;

import br.com.elo7.contraladorsondas.sonda.application.api.*;
import br.com.elo7.contraladorsondas.sonda.application.repository.SondaRepository;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class SondaApplicationService implements SondaService {
    private final SondaRepository sondaRepository;

    @Override
    public SondaResponse criaSonda(SondaRequest sondaRequest) {
        log.info("[inicia] SondaApplicationService - criaSonda");
        Sonda sonda = sondaRepository.salva(new Sonda(sondaRequest));
        log.info("[finaliza] SondaApplicationService - criaSonda");
        return SondaResponse.builder().idSonda(sonda.getIdSonda()).build();
    }

    @Override
    public List<SondaListResponse> buscaTodasSondas() {
        log.info("[inicia] SondaApplicationService - buscaTodasSondas");
        List<Sonda> sondas = sondaRepository.buscaTodasSondas();
        log.info("[finaliza] SondaApplicationService - buscaTodasSondas");
        return SondaListResponse.converte(sondas);
    }

    @Override
    public SondaDetalhadoResponse buscaSondaAtravesId(UUID idSonda) {
        log.info("[inicia] SondaApplicationService - buscaSondaAtravesId");
        Sonda sonda = sondaRepository.buscaSondaAtravesId(idSonda);
        log.info("[inicia] SondaApplicationService - buscaSondaAtravesId");
        return new SondaDetalhadoResponse(sonda);
    }

    @Override
    public void deletaSondaAtravesId(UUID idSonda) {
        log.info("[inicia] SondaApplicationService - deletaSondaAtravesId");
        Sonda sonda = sondaRepository.buscaSondaAtravesId(idSonda);
        sondaRepository.deletaSondaAtravesId(sonda);
        log.info("[finaliza] SondaApplicationService - deletaSondaAtravesId");
    }

    @Override
    public void patchAlteraSonda(UUID idSonda, SondaAlteracaoRequest sondaAlteracaoRequest) {
        log.info("[inicia] SondaApplicationService - patchAlteraSonda");
        Sonda sonda = sondaRepository.buscaSondaAtravesId(idSonda);
        sonda.altera(sondaAlteracaoRequest);
        sondaRepository.salva(sonda);
        log.info("[inicia] SondaApplicationService - patchAlteraSonda");

    }
}
