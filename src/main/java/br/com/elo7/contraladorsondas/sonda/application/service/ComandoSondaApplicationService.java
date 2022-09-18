package br.com.elo7.contraladorsondas.sonda.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.elo7.contraladorsondas.sonda.application.api.comando.ComandoSondaRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ComandoSondaApplicationService implements ComandoSondaService {

	@Override
	public void comandaSonda(UUID idSonda, @Valid ComandoSondaRequest comandoRequest) {
		log.info("[inicia] ComandoSondaApplicationService - comandaSonda");
		log.info("[finaliza] ComandoSondaApplicationService - comandaSonda");
	}

}
