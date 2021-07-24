package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Endereco;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.EnderecoModel;
import org.mapstruct.Mapper;

@Mapper(config = DefaultMapperConfiguration.class)
public interface EnderecoMapper extends GenericMapper<EnderecoModel, Endereco>{

    //@Mapping()
    EnderecoModel toEntity(Endereco domain);

    Endereco toDomain(EnderecoModel model);

}
