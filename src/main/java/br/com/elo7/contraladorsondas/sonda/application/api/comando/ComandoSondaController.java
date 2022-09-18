package br.com.elo7.contraladorsondas.sonda.application.api.comando;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.elo7.contraladorsondas.sonda.application.service.ComandoSondaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ComandoSondaController implements ComandoSondaAPI {
	private final ComandoSondaService comandoSondaService;

	@Override
	public void postComandoSonda(UUID idSonda, @Valid ComandoSondaRequest comandoRequest) {
		log.info("[inicia] ComandoSondaController - postComandoSonda");
		comandoSondaService.comandaSonda(idSonda, comandoRequest);
		log.info("[finaliza] PousoSondaPlanetaController - postPousoSondaPlaneta");
		
	}
}
