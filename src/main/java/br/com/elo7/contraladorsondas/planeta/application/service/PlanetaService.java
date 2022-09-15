package br.com.elo7.contraladorsondas.planeta.application.service;

import java.util.List;

import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaListResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.planetaRequest;

public interface PlanetaService {
	PlanetaResponse criaPlaneta(planetaRequest planetaRequest);
	List<PlanetaListResponse> buscaTodosPlanetas();
}
