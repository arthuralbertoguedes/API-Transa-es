package br.com.DesafioItau.web.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record TransacaoDTO(@Positive(message = "Não é permitido valores iguais ou menores que zero.") float valor, @NotNull(message = "Data não pode ser nula.") OffsetDateTime dataHora) {

	
}
