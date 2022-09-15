package br.com.elo7.contraladorsondas.planeta.infra;

import java.util.List;
import org.springframework.stereotype.Repository;
import br.com.elo7.contraladorsondas.planeta.application.repository.PlanetaRepository;
import br.com.elo7.contraladorsondas.planeta.domain.Planeta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PlanetaInfraRepository implements PlanetaRepository {
	private final PlanetaSpringDataJPARepository planetaSpringDataJPARepository;

	@Override
	public Planeta salva(Planeta planeta) {
		log.info("[inicia]PlanetaInfraRepository - salva");
		planetaSpringDataJPARepository.save(planeta);
		log.info("[finaliza]PlanetaInfraRepository - salva");
		return planeta;
	}

	@Override
	public List<Planeta> buscaTodosPlanetas() {
		log.info("[inicia]PlanetaInfraRepository - buscaTodosPlanetas");
		List<Planeta> todosPlanetas = planetaSpringDataJPARepository.findAll();
		log.info("[finaliza]PlanetaInfraRepository - buscaTodosPlanetas");
		return todosPlanetas;
	}
}
