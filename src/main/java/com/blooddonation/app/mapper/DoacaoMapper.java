package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Doacao;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.DoacaoModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfiguration.class)
public interface DoacaoMapper extends GenericMapper<DoacaoModel, Doacao>{

    //@Mapping(target = "")
    DoacaoModel toEntity(Doacao domain);

    Doacao toDomain(DoacaoModel model);

}
