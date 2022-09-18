package br.com.elo7.contraladorsondas.sonda.domain;

import lombok.Getter;

@Getter
public enum DirecaoSonda {
	NORTE(0), LESTE(90), SUL(180), OESTE(270);
	
	private Integer grau;

	private DirecaoSonda(Integer grau) {
		this.grau = grau;
	}
}
