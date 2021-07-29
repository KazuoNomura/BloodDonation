package com.blooddonation.app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    private Long id;

    private String logradouro;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private String numero;

    private String complemento;
}
