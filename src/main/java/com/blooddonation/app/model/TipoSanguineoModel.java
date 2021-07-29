package com.blooddonation.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tipo_sanguineo", schema = "dbep001")
public class TipoSanguineoModel implements Serializable {

    @Id
    @Column(name="id_tipo", nullable = false, columnDefinition = "INT(1)")
    private Long id;

    @Column(name="tipo", nullable = false, columnDefinition = "CHAR(3)")
    private String tipo;
}
