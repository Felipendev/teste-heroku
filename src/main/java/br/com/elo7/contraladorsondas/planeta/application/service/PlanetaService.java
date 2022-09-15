package br.com.elo7.contraladorsondas.planeta.application.service;

import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.planetaRequest;

public interface PlanetaService {
	PlanetaResponse criaPlaneta(planetaRequest planetaRequest);
}
