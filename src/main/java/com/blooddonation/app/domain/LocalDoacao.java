package com.blooddonation.app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalDoacao {

    private String funcionamento;

    private Endereco endereco;

    private Telefone telefone;
}
