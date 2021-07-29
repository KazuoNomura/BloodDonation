package com.blooddonation.app.domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDTO {

    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "logradouro", required = true)
    private String logradouro;

    @JsonProperty(value = "bairro", required = true)
    private String bairro;

    @JsonProperty(value = "cidade", required = true)
    private String cidade;

    @JsonProperty(value = "estado", required = true)
    private String estado;

    @JsonProperty(value = "cep", required = true)
    private String cep;

    @JsonProperty(value = "numero", required = true)
    private String numero;

    @JsonProperty(value = "complemento")
    private String complemento;
}
