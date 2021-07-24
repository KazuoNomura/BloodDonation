package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.TipoSanguineo;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.TipoSanguineoModel;
import org.mapstruct.Mapper;

@Mapper(config = DefaultMapperConfiguration.class)
public interface TipoSanguineoMapper extends GenericMapper<TipoSanguineoModel, TipoSanguineo>{

    //@Mapping()
    TipoSanguineoModel toEntity(TipoSanguineo domain);

    TipoSanguineo toDomain(TipoSanguineoModel model);

}
