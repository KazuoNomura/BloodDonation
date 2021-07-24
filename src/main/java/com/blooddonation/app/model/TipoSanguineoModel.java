package com.blooddonation.app.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_sanguineo", schema = "dbep001")
public class TipoSanguineoModel {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="tipo")
    private String tipo;
}
