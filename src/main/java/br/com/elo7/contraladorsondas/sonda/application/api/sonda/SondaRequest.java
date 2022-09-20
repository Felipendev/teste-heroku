package br.com.elo7.contraladorsondas.sonda.application.api.sonda;

import javax.validation.constraints.NotBlank;

import br.com.elo7.contraladorsondas.sonda.domain.Sonda;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@EqualsAndHashCode
public class SondaRequest {
    @NotBlank
    private String nome;
}
