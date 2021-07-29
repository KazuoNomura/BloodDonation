package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.TipoSanguineo;
import com.blooddonation.app.model.TipoSanguineoModel;
import org.springframework.stereotype.Component;

@Component
public class TipoSanguineoMapper{

    public TipoSanguineoModel toEntity(TipoSanguineo domain) {

        TipoSanguineoModel model = new TipoSanguineoModel();
        model.setId(Long.valueOf(domain.getId()));
        return model;
    }

    public TipoSanguineo toDomain(TipoSanguineoModel model) {
        TipoSanguineo domain = new TipoSanguineo();
        domain.setId(model.getId().intValue());
        domain.setTipo(model.getTipo());
        return domain;
    }
}
