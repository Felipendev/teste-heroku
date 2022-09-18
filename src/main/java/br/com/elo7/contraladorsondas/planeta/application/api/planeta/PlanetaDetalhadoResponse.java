package br.com.elo7.contraladorsondas.planeta.application.api.planeta;

import br.com.elo7.contraladorsondas.planeta.domain.Planeta;
import lombok.Value;

@Value
public class PlanetaDetalhadoResponse {
	private String nomePlaneta;
	private int limiteX;
	private int limiteY;

	public PlanetaDetalhadoResponse(Planeta planeta) {
		this.nomePlaneta = planeta.getNomePlaneta();
		this.limiteX = planeta.getLimiteX();
		this.limiteY = planeta.getLimiteY();
	}
}