package br.com.elo7.contraladorsondas.sonda.application.api;

import br.com.elo7.contraladorsondas.sonda.application.service.SondaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class SondaController implements SondaAPI {
    private final SondaService sondaService;

    @Override
    public SondaResponse postSonda(SondaRequest sondaRequest) {
        log.info("[inicia] SondaController - postSonda");
        SondaResponse sondaCriada = sondaService.criaSonda(sondaRequest);
        log.info("[finaliza] SondaController - postSonda");
        return sondaCriada;
    }

    @Override
    public List<SondaListResponse> getTodasSondas() {
        log.info("[inicia] SondaController - getTodasSondas");
        List<SondaListResponse> sondas = sondaService.buscaTodasSondas();
        log.info("[finaliza] SondaController - getTodasSondas");
        return sondas;
    }

    @Override
    public SondaDetalhadoResponse getSondaAtravesId(UUID idSonda) {
        log.info("[inicia] SondaController - getSondaAtravesId");
        SondaDetalhadoResponse sondaDetalhada = sondaService.buscaSondaAtravesId(idSonda);
        log.info("[finaliza] SondaController - getSondaAtravesId");
        return sondaDetalhada;
    }

    @Override
    public void deletaSondaAtravesId(UUID idSonda) {
        log.info("[inicia] SondaController - deletaSondaAtravesId");
        sondaService.deletaSondaAtravesId(idSonda);
        log.info("[finaliza] SondaController - deletaSondaAtravesId");
    }

    @Override
    public void patchAlteraSonda(UUID idSonda, SondaAlteracaoRequest sondaAlteracaoRequest) {
        log.info("[inicia] SondaController - patchAlteraSonda");
        sondaService.patchAlteraSonda(idSonda, sondaAlteracaoRequest);
        log.info("[finaliza] SondaController - patchAlteraSonda");
    }
}
