package br.com.elo7.contraladorsondas.sonda.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.elo7.contraladorsondas.sonda.application.api.comando.ComandoSondaRequest;

public interface ComandoSondaService {
	void comandaSonda(UUID idSonda, @Valid ComandoSondaRequest comandoRequest);
}
