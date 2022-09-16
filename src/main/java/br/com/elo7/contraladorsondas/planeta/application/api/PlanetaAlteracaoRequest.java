package br.com.elo7.contraladorsondas.planeta.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PlanetaAlteracaoRequest {
	@NotBlank
	private String nomePlaneta;
	@NotNull
	private int limiteX;
	@NotNull
	private int limiteY;
}
