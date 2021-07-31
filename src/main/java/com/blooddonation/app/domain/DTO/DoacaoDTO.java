package com.blooddonation.app.domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoacaoDTO {

    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "codigo_doador", required = true)
    private Long codigo_doador;

    @JsonProperty(value = "codigo_localDoacao", required = true)
    private Long codigo_localDoacao;

    @JsonProperty(value = "registro", required = true)
    private String registro;
}
