package br.com.elo7.contraladorsondas.sonda.application.api.sonda;

import java.util.List;
import java.util.stream.Collectors;

import br.com.elo7.contraladorsondas.sonda.domain.PosicaoSonda;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.Value;
@Value
public class SondaListResponse {
    private String nome;
	private PosicaoSonda posicao;

    public static List<SondaListResponse> converte(List<Sonda> sondas) {
        return sondas.stream()
                .map(SondaListResponse::new)
                .collect(Collectors.toList());
    }
    
    public SondaListResponse(Sonda sonda) {
        this.nome = sonda.getNome();
        this.posicao = sonda.getPosicao();
    }
}
