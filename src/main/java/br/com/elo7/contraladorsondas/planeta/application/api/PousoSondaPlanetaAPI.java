package br.com.elo7.contraladorsondas.planeta.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/planeta")
public interface PousoSondaPlanetaAPI {	
	@PostMapping(value = "/{idPlaneta}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraPlaneta(@PathVariable UUID idPlaneta,
			@Valid @RequestBody PousoSondaPlanetaRequest planetaAlteracaoRequest);
}