package br.com.elo7.contraladorsondas.sonda.application.api;

import br.com.elo7.contraladorsondas.sonda.domain.Direcao;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.Value;

@Value
public class SondaDetalhadoResponse {
    private int posicaoX;
    private int posicaoY;
    private Direcao direcao;

    public SondaDetalhadoResponse(Sonda sonda) {
        this.posicaoX = sonda.getPosicaoX();
        this.posicaoY = sonda.getPosicaoY();
        this.direcao = sonda.getDirecao();
    }
}
