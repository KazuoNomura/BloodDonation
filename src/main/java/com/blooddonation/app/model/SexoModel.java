package com.blooddonation.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "sexo", schema = "dbep001")
public class SexoModel implements Serializable {

    @Id
    @Column(name="id", nullable = false, columnDefinition = "INT(1)")
    private Long idSexo;

    @Column(name="sigla", nullable = false, columnDefinition = "CHAR(1)")
    private String sigla;
}
