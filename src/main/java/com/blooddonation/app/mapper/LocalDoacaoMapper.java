package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.LocalDoacao;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.LocalDoacaoModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {EnderecoMapper.class, TelefoneMapper.class }, config = DefaultMapperConfiguration.class)
public interface LocalDoacaoMapper extends GenericMapper<LocalDoacaoModel, LocalDoacao>{

    @Mapping(target = "", ignore = true)
    LocalDoacaoModel toEntity(LocalDoacao domain);

    @Mapping(target = "", ignore = true)
    LocalDoacao toDomain(LocalDoacaoModel model);

}
