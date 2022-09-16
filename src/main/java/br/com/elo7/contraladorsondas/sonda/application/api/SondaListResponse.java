package br.com.elo7.contraladorsondas.sonda.application.api;

import br.com.elo7.contraladorsondas.sonda.domain.Direcao;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;
@Value
public class SondaListResponse {
    private int posicaoX;
    private int posicaoY;
    private Direcao direcao;

    public static List<SondaListResponse> converte(List<Sonda> sondas) {
        return sondas.stream()
                .map(SondaListResponse::new)
                .collect(Collectors.toList());
    }
    public SondaListResponse(Sonda sonda) {
        this.posicaoX = sonda.getPosicaoX();
        this.posicaoY = sonda.getPosicaoY();
        this.direcao = sonda.getDirecao();
    }
}
