package br.com.elo7.contraladorsondas.sonda.application.service;

import br.com.elo7.contraladorsondas.sonda.application.api.*;

import java.util.List;
import java.util.UUID;

public interface SondaService {
    SondaResponse criaSonda(SondaRequest sondaRequest);
    List<SondaListResponse> buscaTodasSondas();
    SondaDetalhadoResponse buscaSondaAtravesId(UUID idSonda);
    void deletaSondaAtravesId(UUID idSonda);
    void patchAlteraSonda(UUID idSonda, SondaAlteracaoRequest sondaAlteracaoRequest);
}
