package br.com.elo7.contraladorsondas.planeta.application.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaAlteracaoRequest;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaDetalhadoResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaListResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.planetaRequest;

public interface PlanetaService {
	PlanetaResponse criaPlaneta(planetaRequest planetaRequest);
	List<PlanetaListResponse> buscaTodosPlanetas();
	PlanetaDetalhadoResponse buscaClienteAtravesID(UUID idPlaneta);
	void deletaPlanetaAtravesID(UUID idPlaneta);
	void patchAlteraPlaneta(UUID idPlaneta, @Valid PlanetaAlteracaoRequest planetaAlteracaoRequest);
}
