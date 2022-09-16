package br.com.elo7.contraladorsondas.sonda.application.api;

import br.com.elo7.contraladorsondas.sonda.domain.Direcao;
import lombok.Value;

import javax.validation.constraints.NotNull;
@Value
public class SondaAlteracaoRequest {
    @NotNull
    private int posicaoX;
    @NotNull
    private int posicaoY;
    @NotNull
    private Direcao direcao;
}
