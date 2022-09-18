package br.com.elo7.contraladorsondas.planeta.application.api.planeta;

import java.util.List;
import java.util.stream.Collectors;
import br.com.elo7.contraladorsondas.planeta.domain.Planeta;
import lombok.Value;

@Value
public class PlanetaListResponse {
	private String nomePlaneta;
	private int limiteX;
	private int limiteY;
	
	public static List<PlanetaListResponse> converte(List<Planeta> planeta) {
		return planeta.stream()
				.map(PlanetaListResponse::new)
				.collect(Collectors.toList());
	}

	public PlanetaListResponse(Planeta planeta) {
		this.nomePlaneta = planeta.getNomePlaneta();
		this.limiteX = planeta.getLimiteX();
		this.limiteY = planeta.getLimiteY();
	}
}	


