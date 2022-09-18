package br.com.elo7.contraladorsondas.planeta.application.api.planeta;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PlanetaRequest {
	@NotBlank
	private String nomePlaneta;
	@NotNull
	private Integer limiteX;
	@NotNull
	private Integer limiteY;
}
