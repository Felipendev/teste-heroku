package br.com.elo7.contraladorsondas.sonda.application.api.sonda;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class SondaResponse {
    private UUID idSonda;
}
