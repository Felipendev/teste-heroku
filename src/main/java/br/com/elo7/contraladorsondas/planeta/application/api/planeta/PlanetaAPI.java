package br.com.elo7.contraladorsondas.planeta.application.api.planeta;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<PlanetaListResponse> getTodosPlaneta();
	
	@GetMapping(value = "/{idPlaneta}")
	@ResponseStatus(code = HttpStatus.OK)
	PlanetaDetalhadoResponse getPlanetaAtravesId(@PathVariable UUID idPlaneta);	
	
	@DeleteMapping(value = "/{idPlaneta}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaPlanetaAtravesId(@PathVariable UUID idPlaneta);
	
	@PatchMapping(value = "/{idPlaneta}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraPlaneta(@PathVariable UUID idPlaneta,
			@Valid @RequestBody PlanetaAlteracaoRequest planetaAlteracaoRequest);
}