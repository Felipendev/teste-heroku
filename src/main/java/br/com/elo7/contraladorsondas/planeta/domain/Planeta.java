package br.com.elo7.contraladorsondas.planeta.domain;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.elo7.contraladorsondas.planeta.application.api.planeta.PlanetaAlteracaoRequest;
import br.com.elo7.contraladorsondas.planeta.application.api.planeta.planetaRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Entity
public class Planeta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPlaneta", updatable = false, unique = true, nullable = false)
	private UUID idPlaneta;
	
	@NotBlank
	private String nomePlaneta;
	@NotNull
	private int limiteX;
	@NotNull
	private int limiteY;

	public Planeta(planetaRequest planetaRequest) {
		this.nomePlaneta = planetaRequest.getNomePlaneta();
		this.limiteX = planetaRequest.getLimiteX();
		this.limiteY = planetaRequest.getLimiteY();
	}

	public void altera(PlanetaAlteracaoRequest planetaAlteracaoRequest) {
		this.nomePlaneta = planetaAlteracaoRequest.getNomePlaneta();
		this.limiteX = planetaAlteracaoRequest.getLimiteX();
		this.limiteY = planetaAlteracaoRequest.getLimiteY();
	}
}
