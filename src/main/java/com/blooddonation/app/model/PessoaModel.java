package com.blooddonation.app.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "pessoa", schema = "dbep001")
public class PessoaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_pessoa", nullable = false, columnDefinition = "INT(5)")
    private Long id;

    @NotNull
    @Column(name="nome", nullable = false, columnDefinition = "VARCHAR(20)")
    private String nome;

    @NotNull
    @Column(name="sobrenome", nullable = false, columnDefinition = "VARCHAR(20)")
    private String sobrenome;

    @NotNull
    @Column(name="cpf", nullable = false, columnDefinition = "VARCHAR(11)")
    private String cpf;

    @NotNull
    @Column(name="rg", nullable = false, columnDefinition = "VARCHAR(9)")
    private String rg;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name="id_endereco", referencedColumnName = "id_endereco")
    private EnderecoModel endereco;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name="id_telefone", referencedColumnName = "id_telefone")
    private TelefoneModel telefone;

    @NotNull
    @JoinColumn(name="id_sexo", referencedColumnName = "id_sexo")
    private SexoModel sexo;

    @NotNull
    @JoinColumn(name="id_tipo", referencedColumnName = "id_tipo")
    private TipoSanguineoModel tipo;
}
