package com.blooddonation.app.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Doacao {

    private Long codigo_doador;

    private Long codigo_localDoacao;

    private LocalDate registro;
}
