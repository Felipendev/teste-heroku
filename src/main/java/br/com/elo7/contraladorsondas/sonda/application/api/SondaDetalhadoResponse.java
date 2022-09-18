package br.com.elo7.contraladorsondas.sonda.application.api;

import br.com.elo7.contraladorsondas.sonda.domain.PosicaoSonda;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.Value;

@Value
public class SondaDetalhadoResponse {
    private String nome;
	private PosicaoSonda posicao;

    public SondaDetalhadoResponse(Sonda sonda) {
        this.nome = sonda.getNome();
        this.posicao = sonda.getPosicao();
    }
}
