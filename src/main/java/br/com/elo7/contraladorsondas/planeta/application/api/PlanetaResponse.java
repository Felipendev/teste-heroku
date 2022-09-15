package br.com.elo7.contraladorsondas.planeta.application.api;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PlanetaResponse {
	private UUID idPlaneta;
}
