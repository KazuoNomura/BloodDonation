package com.blooddonation.app.domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SexoDTO {

    @JsonProperty(value = "codigo", required = true)
    private int codigo;
}
