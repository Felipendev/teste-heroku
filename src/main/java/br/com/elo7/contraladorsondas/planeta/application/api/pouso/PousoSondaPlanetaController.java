package br.com.elo7.contraladorsondas.planeta.application.api.pouso;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.elo7.contraladorsondas.planeta.application.service.PousoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PousoSondaPlanetaController implements PousoSondaPlanetaAPI {
	private final PousoService pousoService;
	
	@Override
	public void postPousoSondaPlaneta(UUID idPlaneta, @Valid PousoSondaPlanetaRequest pousoRequest) {
		log.info("[inicia] PousoSondaPlanetaController - postPousoSondaPlaneta");
		pousoService.pousa(idPlaneta, pousoRequest);
		log.info("[finaliza] PousoSondaPlanetaController - postPousoSondaPlaneta");
	}
}
