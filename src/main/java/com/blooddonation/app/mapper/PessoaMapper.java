package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Pessoa;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.PessoaModel;
import org.mapstruct.Mapper;

@Mapper(config = DefaultMapperConfiguration.class)
public interface PessoaMapper extends GenericMapper<PessoaModel, Pessoa>{

    //@Mapping()
    PessoaModel toEntity(Pessoa domain);

    Pessoa toDomain(PessoaModel model);

}
