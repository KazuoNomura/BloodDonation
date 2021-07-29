package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Sexo;
import com.blooddonation.app.model.SexoModel;
import org.springframework.stereotype.Component;

@Component
public class SexoMapper{

    public SexoModel toEntity(Sexo domain) {
        SexoModel model = new SexoModel();
        model.setId(Long.valueOf(domain.getId()));
        return model;
    }

    public Sexo toDomain(SexoModel model) {
        Sexo domain = new Sexo();
        domain.setId(model.getId().intValue());
        domain.setSigla(model.getSigla());
        return domain;
    }
}
