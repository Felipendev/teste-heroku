package br.com.elo7.contraladorsondas.sonda.domain;

import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@EqualsAndHashCode
@Embeddable
@Builder(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class PosicaoSonda {
	private Integer posicaoX;
	private Integer posicaoY;
	private DirecaoSonda direcao;

	void movimenta(ComandoSonda c) {
		if(ComandoSonda.M == c) {
			switch (this.direcao) {
			case NORTE:
				movimentaParaNorte();
				break;
			case LESTE:
				movimentaParaLeste();
				break;
			case SUL:
				movimentaParaSul();
				break;
			case OESTE:
				movimentaParaOeste();
				break;
			default:
				break;
			}
		}
	}

	private void movimentaParaOeste() {
		this.posicaoX = this.posicaoX - 1;
	}

	private void movimentaParaSul() {
		this.posicaoY = this.posicaoY - 1;
	}

	private void movimentaParaLeste() {
		this.posicaoX = this.posicaoX + 1;
	}

	private void movimentaParaNorte() {
		this.posicaoY = this.posicaoY + 1;
	}

	public void mudaDirecao(ComandoSonda c) {
		switch (c) {
		case L:
			this.direcao = this.direcao.getEsquerda();
			break;
		case R:
			this.direcao = this.direcao.getDireita();
			break;
		default:
			break;
		}
	}

}
