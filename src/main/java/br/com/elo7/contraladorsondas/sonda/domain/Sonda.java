package br.com.elo7.contraladorsondas.sonda.domain;

import br.com.elo7.contraladorsondas.sonda.application.api.SondaAlteracaoRequest;
import br.com.elo7.contraladorsondas.sonda.application.api.SondaRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Entity
public class Sonda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idSonda", updatable = false, unique = true, nullable = false)
    private UUID idSonda;
    @NotNull
    private int posicaoX;
    @NotNull
    private int posicaoY;
    @NotNull
    private Direcao direcao;

    public Sonda(SondaRequest sondaRequest) {
        this.posicaoX = sondaRequest.getPosicaoX();
        this.posicaoY = sondaRequest.getPosicaoY();
        this.direcao = sondaRequest.getDirecao();
    }
    public void altera(SondaAlteracaoRequest sondaAlteracaoRequest) {
        this.posicaoX = sondaAlteracaoRequest.getPosicaoX();
        this.posicaoY = sondaAlteracaoRequest.getPosicaoY();
        this.direcao = sondaAlteracaoRequest.getDirecao();
    }
}
