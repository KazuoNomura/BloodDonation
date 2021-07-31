package com.blooddonation.app.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "local_doacao", schema = "dbep001")
public class LocalDoacaoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_local_doacao", nullable = false, columnDefinition = "INT(5)")
    private Long id;

    @NotNull
    @Column(name="nome", nullable = false, columnDefinition = "VARCHAR(20)")
    private String nome;

    @NotNull
    @Column(name="funcionamento", nullable = false, columnDefinition = "VARCHAR(20)")
    private String funcionamento;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_endereco", referencedColumnName = "id_endereco")
    private EnderecoModel endereco;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_telefone", referencedColumnName = "id_telefone")
    private TelefoneModel telefone;
}
