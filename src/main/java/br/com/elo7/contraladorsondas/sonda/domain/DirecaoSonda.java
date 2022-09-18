package br.com.elo7.contraladorsondas.sonda.domain;

public enum DirecaoSonda {

	NORTE {
		@Override
		DirecaoSonda getEsquerda() {
			return DirecaoSonda.OESTE;
		}

		@Override
		DirecaoSonda getDireita() {
			return DirecaoSonda.LESTE;
		}

	},
	LESTE {
		@Override
		DirecaoSonda getEsquerda() {
			return DirecaoSonda.NORTE;
		}

		@Override
		DirecaoSonda getDireita() {
			return DirecaoSonda.SUL;
		}
	},
	SUL {
		@Override
		DirecaoSonda getEsquerda() {
			return DirecaoSonda.LESTE;
		}

		@Override
		DirecaoSonda getDireita() {
			return DirecaoSonda.OESTE;
		}
	},
	OESTE {
		@Override
		DirecaoSonda getEsquerda() {
			return DirecaoSonda.SUL;
		}

		@Override
		DirecaoSonda getDireita() {
			return DirecaoSonda.NORTE;
		}

	};

	abstract DirecaoSonda getEsquerda();
	abstract DirecaoSonda getDireita();
}
