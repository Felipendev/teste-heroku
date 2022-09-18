package br.com.elo7.contraladorsondas.sonda.domain;

import java.util.stream.Stream;

import org.springframework.http.HttpStatus;

import br.com.elo7.contraladorsondas.handler.APIException;
import lombok.Getter;

@Getter
public enum DirecaoSonda {
	NORTE(0), LESTE(90), SUL(180), OESTE(270);
	
	private Integer grau;

	private DirecaoSonda(Integer grau) {
		this.grau = grau;
	}
	
	public static DirecaoSonda buscaDirecaoAtravesGrau(Integer grau) {
		return Stream.of(DirecaoSonda.values())
				.filter(d -> d.getGrau().equals(grau))
				.findFirst()
				.orElseThrow(() -> APIException.build(HttpStatus.INTERNAL_SERVER_ERROR, "ERRO AO BUSCAR DIRECAO SONDA!"));
	}
}
