package br.com.elo7.contraladorsondas.sonda.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/sonda")
public interface SondaAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    SondaResponse postSonda(@RequestBody @Valid SondaRequest sondaRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<SondaListResponse> getTodasSondas();

    @GetMapping(value = "/{idSonda}")
    @ResponseStatus(code = HttpStatus.OK)
    SondaDetalhadoResponse getSondaAtravesId(@PathVariable UUID idSonda);

    @DeleteMapping(value = "/{idSonda}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaSondaAtravesId(@PathVariable UUID idSonda);

    @PatchMapping(value = "/{idSonda}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraSonda(@PathVariable UUID idSonda,
                            @Valid @RequestBody SondaAlteracaoRequest sondaAlteracaoRequest);
}
