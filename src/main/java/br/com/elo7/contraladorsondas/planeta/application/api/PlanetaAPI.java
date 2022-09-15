package br.com.elo7.contraladorsondas.planeta.application.api;

import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/planeta")
public interface PlanetaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PlanetaResponse postPlaneta(@Valid @RequestBody planetaRequest planetaRequest);
}