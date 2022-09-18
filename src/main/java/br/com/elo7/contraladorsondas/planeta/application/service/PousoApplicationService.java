package br.com.elo7.contraladorsondas.planeta.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.elo7.contraladorsondas.planeta.application.api.PousoSondaPlanetaRequest;
import br.com.elo7.contraladorsondas.planeta.application.repository.PlanetaRepository;
import br.com.elo7.contraladorsondas.sonda.application.repository.SondaRepository;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PousoApplicationService implements PousoService {
	private final PlanetaRepository planetaRepository;
	private final SondaRepository sondaRepository;
	
	@Override
	public void pousa(UUID idPlaneta, @Valid PousoSondaPlanetaRequest pousoRequest) {
		log.info("[inicia] PousoApplicationService - pousa");
		planetaRepository.buscaPlanetaAtravesId(idPlaneta);
		Sonda sondaAtravesId = sondaRepository.buscaSondaAtravesId(pousoRequest.getIdSonda());
		sondaAtravesId.pousa(idPlaneta, pousoRequest);
		sondaRepository.salva(sondaAtravesId);
		log.info("[finaliza] PousoApplicationService - pousa");
	}
}
