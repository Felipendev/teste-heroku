package br.com.elo7.contraladorsondas.planeta.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.elo7.contraladorsondas.planeta.application.service.PlanetaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PlanetaController implements PlanetaAPI {
	private final PlanetaService planetaService;

	@Override
	public PlanetaResponse postPlaneta(planetaRequest planetaRequest) {
		log.info("[inicia] PlanetaController - postPlaneta");
		PlanetaResponse planetaCriado = planetaService.criaPlaneta(planetaRequest);
		log.info("[finaliza] PlanetaController - postPlaneta");
		return planetaCriado;
	}
}