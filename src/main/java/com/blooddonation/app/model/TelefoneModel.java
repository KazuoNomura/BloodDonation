package com.blooddonation.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "telefone", schema = "dbep001")
public class TelefoneModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_telefone", nullable = false, columnDefinition = "INT(5)")
    private Long id;

    @Column(name="numero", nullable = false, columnDefinition = "VARCHAR(11)")
    private String numero;
}
