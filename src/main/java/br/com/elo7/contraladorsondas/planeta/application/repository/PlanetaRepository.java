package br.com.elo7.contraladorsondas.planeta.application.repository;

import java.util.List;
import br.com.elo7.contraladorsondas.planeta.domain.Planeta;

public interface PlanetaRepository {
	Planeta salva(Planeta planeta);
	List<Planeta> buscaTodosPlanetas();
}
