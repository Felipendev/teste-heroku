package br.com.elo7.contraladorsondas.planeta.application.api;

import lombok.Value;

@Value
public class PlanetaListResponse {
	private String nomePlaneta;
	private int limiteX;
	private int limiteY;
}
