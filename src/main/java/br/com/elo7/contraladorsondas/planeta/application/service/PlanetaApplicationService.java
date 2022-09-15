package br.com.elo7.contraladorsondas.planeta.application.service;

import org.springframework.stereotype.Service;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.planetaRequest;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PlanetaApplicationService implements PlanetaService{

	@Override
	public PlanetaResponse criaPlaneta(planetaRequest planetaRequest) {
		log.info("[inicia] PlanetaApplicationService - criaPlaneta");
		log.info("[finaliza] PlanetaApplicationService - criaPlaneta");
		return null;
	}
}
