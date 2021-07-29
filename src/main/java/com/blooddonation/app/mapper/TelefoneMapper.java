package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Telefone;
import com.blooddonation.app.model.TelefoneModel;
import org.springframework.stereotype.Component;

@Component
public class TelefoneMapper{

    public TelefoneModel toEntity(Telefone domain) {
        TelefoneModel model = new TelefoneModel();
        model.setId(domain.getId());
        model.setNumero(domain.getNumero());
        return model;
    }

    public Telefone toDomain(TelefoneModel model) {
        Telefone domain = new Telefone();
        domain.setId(model.getId());
        domain.setNumero(model.getNumero());
        return domain;
    }

}
