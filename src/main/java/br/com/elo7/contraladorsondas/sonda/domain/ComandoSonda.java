package br.com.elo7.contraladorsondas.sonda.domain;

import org.springframework.http.HttpStatus;

import br.com.elo7.contraladorsondas.handler.APIException;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ComandoSonda {
	M, L, R;
	
	public static ComandoSonda buscaComandoAtravesValue(String value) {
		try {
			return ComandoSonda.valueOf(value);
		} catch (Exception e) {
			throw APIException.build(HttpStatus.INTERNAL_SERVER_ERROR, "ERRO AO BUSCAR COMANDO SONDA!");
		}
	}
}
