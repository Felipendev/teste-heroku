package br.com.elo7.contraladorsondas.sonda.infra;

import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SondaSpringDataJPARepository extends JpaRepository<Sonda, UUID> {
}
