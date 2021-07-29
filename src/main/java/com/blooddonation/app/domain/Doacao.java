package com.blooddonation.app.domain;

import com.blooddonation.app.model.LocalDoacaoModel;
import com.blooddonation.app.model.PessoaModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doacao {

    private Long id;

    private PessoaModel doador;

    private LocalDoacaoModel localDoacao;

    private String registro;

}
