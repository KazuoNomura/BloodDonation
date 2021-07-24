package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Sexo;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.SexoModel;
import org.mapstruct.Mapper;

@Mapper(config = DefaultMapperConfiguration.class)
public interface SexoMapper extends GenericMapper<SexoModel, Sexo>{

    //@Mapping()
    SexoModel toEntity(Sexo domain);

    Sexo toDomain(SexoModel model);

}
