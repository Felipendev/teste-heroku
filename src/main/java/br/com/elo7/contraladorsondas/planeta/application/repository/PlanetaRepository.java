package br.com.elo7.contraladorsondas.planeta.application.repository;

import java.util.List;
import java.util.UUID;
import br.com.elo7.contraladorsondas.planeta.domain.Planeta;

public interface PlanetaRepository {
	Planeta salva(Planeta planeta);
	List<Planeta> buscaTodosPlanetas();
	Planeta buscaPlanetaAtravesId(UUID idPlaneta);
	void deletaPlaneta(Planeta planeta);
}
