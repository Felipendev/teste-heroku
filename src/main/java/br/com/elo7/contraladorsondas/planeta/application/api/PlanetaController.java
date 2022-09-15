package br.com.elo7.contraladorsondas.planeta.application.api;

import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PlanetaController implements PlanetaAPI {
	
	@Override
	public PlanetaResponse postPlaneta(planetaRequest planetaRequest) {
		log.info("[inicia] PlanetaController - postPlaneta");
		log.info("[finaliza] PlanetaController - postPlaneta");
		return null;
	}
}