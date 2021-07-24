package com.blooddonation.app.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "endereco", schema = "dbep001")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_endereco", nullable = false, columnDefinition = "INT(5)")
    private Long id;

    @NotNull
    @Column(name="logradouro", nullable = false, columnDefinition = "VARCHAR(20)")
    private String logradouro;

    @NotNull
    @Column(name="bairro", nullable = false, columnDefinition = "VARCHAR(20)")
    private String bairro;

    @NotNull
    @Column(name="cidade", nullable = false, columnDefinition = "VARCHAR(15)")
    private String cidade;

    @NotNull
    @Column(name="estado", nullable = false, columnDefinition = "VARCHAR(2)")
    private String estado;

    @NotNull
    @Column(name="cep", nullable = false, columnDefinition = "VARCHAR(8)")
    private String cep;

    @NotNull
    @Column(name="numero", nullable = false, columnDefinition = "VARCHAR(10)")
    private String numero;

    @Column(name="complemento", nullable = false, columnDefinition = "VARCHAR(10)")
    private String complemento;
}
