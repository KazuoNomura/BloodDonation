package com.blooddonation.app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {

    private Long id;

    private String nome;

    private String sobrenome;

    private String cpf;

    private String rg;

    private Endereco endereco;

    private Telefone telefone;

    private Sexo sexo;

    private TipoSanguineo tipo;
}
