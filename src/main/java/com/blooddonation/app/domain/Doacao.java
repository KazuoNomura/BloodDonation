package com.blooddonation.app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doacao {

    private Long id;

    private Pessoa doador;

    private LocalDoacao localDoacao;

    private String registro;

}
