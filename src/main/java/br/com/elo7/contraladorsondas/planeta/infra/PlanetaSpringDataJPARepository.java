package br.com.elo7.contraladorsondas.planeta.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.elo7.contraladorsondas.planeta.domain.Planeta;

public interface PlanetaSpringDataJPARepository extends JpaRepository<Planeta, UUID>{
}
