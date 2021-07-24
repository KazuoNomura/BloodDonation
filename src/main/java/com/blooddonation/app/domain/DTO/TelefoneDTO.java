package com.blooddonation.app.domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelefoneDTO {

    @JsonProperty(value = "numero_telefone", required = true)
    private String numero;
}
