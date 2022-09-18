package br.com.elo7.contraladorsondas.planeta.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.elo7.contraladorsondas.planeta.application.api.PousoSondaPlanetaRequest;

public interface PousoService {
	void pousa(UUID idPlaneta, @Valid PousoSondaPlanetaRequest pousoRequest);
}
