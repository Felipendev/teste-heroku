package br.com.elo7.contraladorsondas.sonda.application.service;

import java.util.List;
import java.util.UUID;

import br.com.elo7.contraladorsondas.sonda.application.api.sonda.SondaAlteracaoRequest;
import br.com.elo7.contraladorsondas.sonda.application.api.sonda.SondaDetalhadoResponse;
import br.com.elo7.contraladorsondas.sonda.application.api.sonda.SondaListResponse;
import br.com.elo7.contraladorsondas.sonda.application.api.sonda.SondaRequest;
import br.com.elo7.contraladorsondas.sonda.application.api.sonda.SondaResponse;

public interface SondaService {
    SondaResponse criaSonda(SondaRequest sondaRequest);
    List<SondaListResponse> buscaTodasSondas();
    SondaDetalhadoResponse buscaSondaAtravesId(UUID idSonda);
    void deletaSondaAtravesId(UUID idSonda);
    void patchAlteraSonda(UUID idSonda, SondaAlteracaoRequest sondaAlteracaoRequest);
}
