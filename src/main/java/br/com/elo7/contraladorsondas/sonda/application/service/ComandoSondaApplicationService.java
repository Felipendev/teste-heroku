package br.com.elo7.contraladorsondas.sonda.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.elo7.contraladorsondas.sonda.application.api.comando.ComandoSondaRequest;
import br.com.elo7.contraladorsondas.sonda.application.repository.SondaRepository;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ComandoSondaApplicationService implements ComandoSondaService {
	private final SondaRepository sondaRepository;

	@Override
	public void comandaSonda(UUID idSonda, @Valid ComandoSondaRequest comandoRequest) {
		log.info("[inicia] ComandoSondaApplicationService - comandaSonda");
		Sonda sondaAtravesId = sondaRepository.buscaSondaAtravesId(idSonda);
		sondaAtravesId.recebeComando(comandoRequest.getComando());
		sondaRepository.salva(sondaAtravesId);
		log.info("[finaliza] ComandoSondaApplicationService - comandaSonda");
	}
}
