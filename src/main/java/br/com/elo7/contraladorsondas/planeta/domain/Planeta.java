package br.com.elo7.contraladorsondas.planeta.domain;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
}