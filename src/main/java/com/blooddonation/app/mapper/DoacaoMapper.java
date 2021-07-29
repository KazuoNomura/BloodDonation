package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Doacao;
import com.blooddonation.app.model.DoacaoModel;
import org.springframework.stereotype.Component;

@Component
public class DoacaoMapper {

    public DoacaoModel toEntity(Doacao domain);

    public Doacao toDomain(DoacaoModel model);

}
