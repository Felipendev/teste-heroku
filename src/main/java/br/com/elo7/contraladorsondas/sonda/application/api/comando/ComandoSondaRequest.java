package br.com.elo7.contraladorsondas.sonda.application.api.comando;

import javax.validation.constraints.NotBlank;

import lombok.Value;

@Value
public class ComandoSondaRequest {
	@NotBlank
	private String comando;
}
