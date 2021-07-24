package com.blooddonation.app.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dbep001.doacao")
public class DoacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    //@Column(name="doador")
    //private Pessoa doador;

    //@Column(name="localDoacao")
    //private LocalDoacao localDoacao;

    //@Column(name="registro")
    //private LocalDate registro;
}
