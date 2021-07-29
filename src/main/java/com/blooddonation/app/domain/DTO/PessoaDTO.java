package com.blooddonation.app.domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDTO {

    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "nome", required = true)
    private String nome;

    @JsonProperty(value = "sobrenome", required = true)
    private String sobrenome;

    @JsonProperty(value = "cpf", required = true)
    private String cpf;

    @JsonProperty(value = "rg", required = true)
    private String rg;

    @JsonProperty(value = "endereco", required = true)
    private EnderecoDTO endereco;

    @JsonProperty(value = "telefone", required = true)
    private TelefoneDTO telefone;

    @JsonProperty(value = "sexo", required = true)
    private SexoDTO sexo;

    @JsonProperty(value = "tipo_sanguineo", required = true)
    private TipoSanguineoDTO tipo;
}
