package br.com.elo7.contraladorsondas.sonda.application.api.sonda;

import javax.validation.constraints.NotBlank;

import lombok.Value;

@Value
public class SondaRequest {
    @NotBlank
    private String nome;
}