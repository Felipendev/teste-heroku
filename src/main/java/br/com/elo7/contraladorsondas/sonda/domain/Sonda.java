package br.com.elo7.contraladorsondas.sonda.domain;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.Stream;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import br.com.elo7.contraladorsondas.planeta.application.api.pouso.PousoSondaPlanetaRequest;
import br.com.elo7.contraladorsondas.sonda.application.api.sonda.SondaRequest;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Builder
public class Sonda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idSonda", updatable = false, unique = true, nullable = false)
    private UUID idSonda;
    @NotBlank
    private String nome;
    @Embedded
    private PosicaoSonda posicao;
    private LocalDateTime criacao;
    private LocalDateTime alteracao;
    private LocalDateTime momentoPouso;
	private UUID idPlanetaPousada;
	
    public Sonda(String nome) {
    	this.nome = nome;
    	this.criacao = LocalDateTime.now();
    }
    
    public void renomeia(String nome) {
    	this.nome = nome;
    	this.alteracao = LocalDateTime.now();
    }

	public void pousa(UUID idPlaneta, @Valid PousoSondaPlanetaRequest pousoRequest) {
		this.idPlanetaPousada = idPlaneta;
		this.posicao = pousoRequest.getPosicaoSonda();
		this.momentoPouso = LocalDateTime.now();
	}

	public void recebeComando(String comando) {
		Stream.of(comando.split(""))
		.map(c -> ComandoSonda.buscaComandoAtravesValue(c))
		.forEach(c -> executaComando(c));
	}

	private void executaComando(ComandoSonda c) {
		this.getPosicao().mudaDirecao(c);
		this.getPosicao().movimenta(c);
	}
}