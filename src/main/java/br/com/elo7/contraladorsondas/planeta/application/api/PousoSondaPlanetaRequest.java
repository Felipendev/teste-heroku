package br.com.elo7.contraladorsondas.planeta.application.api;

import java.util.UUID;

import br.com.elo7.contraladorsondas.sonda.domain.PosicaoSonda;
import lombok.Value;

@Value
public class PousoSondaPlanetaRequest {
	private UUID idSonda;
	private PosicaoSonda posicaoSonda;
}
