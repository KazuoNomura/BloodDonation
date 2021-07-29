package com.blooddonation.app.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "doacao", schema = "dbep001")
public class DoacaoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_doacao")
    private Long id;

    @NotNull
    @JoinColumn(name="id_pessoa", referencedColumnName = "id_pessoa")
    private PessoaModel doador;

    @NotNull
    @JoinColumn(name="id_local_doacao", referencedColumnName = "id_local_doacao")
    private LocalDoacaoModel localDoacao;

    @Column(name="registro", nullable = false, columnDefinition = "VARCHAR(20)")
    private String registro;
}
