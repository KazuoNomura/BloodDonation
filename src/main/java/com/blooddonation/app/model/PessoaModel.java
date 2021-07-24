package com.blooddonation.app.model;

import javax.persistence.*;

@Entity
@Table(name = "dbep001.pessoa")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="sobrenome")
    private String sobrenome;

    @Column(name="cpf")
    private String cpf;

    @Column(name="rg")
    private String rg;

    //@Column(name="idEndereco")
    //private Endereco endereco;

    //@Column(name="idTelefone")
    //private Telefone telefone;

    //@Column(name="idSexo")
    //private Sexo sexo;

    //@Column(name="idTipoSanguineo")
    //private TipoSanguineo tipo;
}
