package com.blooddonation.app.domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DoacaoDTO {

    @JsonProperty(value = "codigo_doador", required = true)
    private Long codigo_doador;

    @JsonProperty(value = "codigo_localDoacao", required = true)
    private Long codigo_localDoacao;

    @JsonProperty(value = "registro", required = true)
    private String registro;
}
