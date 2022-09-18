package br.com.elo7.contraladorsondas.sonda.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import br.com.elo7.contraladorsondas.planeta.application.api.pouso.PousoSondaPlanetaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
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
}