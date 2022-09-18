package br.com.elo7.contraladorsondas.sonda.domain;

import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@EqualsAndHashCode
@Embeddable
public class PosicaoSonda {
	private Integer posicaoX;
	private Integer posicaoY;
	private DirecaoSonda direcao;
}
