package br.com.elo7.contraladorsondas.planeta.application.api;

import java.util.List;
import java.util.UUID;
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

	@Override
	public List<PlanetaListResponse> getTodosPlaneta() {
		log.info("[inicia] PlanetaController - getTodosPlaneta");
		List<PlanetaListResponse> planetas = planetaService.buscaTodosPlanetas();
		log.info("[finaliza] PlanetaController - getTodosPlaneta");
		return planetas;
	}

	@Override
	public PlanetaDetalhadoResponse getPlanetaAtravesId(UUID idPlaneta) {
		log.info("[inicia] PlanetaController - getPlanetaAtravesId");
		log.info("[idPlaneta] {}", idPlaneta);
		log.info("[finaliza] PlanetaController - getPlanetaAtravesId");	
		return null;
	}
}