package br.com.elo7.contraladorsondas.sonda.domain;

import lombok.Value;

@Value
public class PosicaoSonda {
	private final Integer posicaoX;
	private final Integer posicaoY;
	private final DirecaoSonda direcao;
}
