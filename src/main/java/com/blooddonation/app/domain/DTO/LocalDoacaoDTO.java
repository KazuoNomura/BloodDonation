package com.blooddonation.app.domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalDoacaoDTO {

    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "horario_funcionamento", required = true)
    private String funcionamento;

    @JsonProperty(value = "telefone", required = true)
    private TelefoneDTO telefone;

    @JsonProperty(value = "endereco", required = true)
    private EnderecoDTO endereco;
}
