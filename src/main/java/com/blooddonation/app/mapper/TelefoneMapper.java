package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Telefone;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.TelefoneModel;
import org.mapstruct.Mapper;

@Mapper(config = DefaultMapperConfiguration.class)
public interface TelefoneMapper extends GenericMapper<TelefoneModel, Telefone>{

    //@Mapping()
    TelefoneModel toEntity(Telefone domain);

    Telefone toDomain(TelefoneModel model);

}
