package com.blooddonation.app.mapper;

import java.util.List;

public interface GenericMapper<ENTITY, DOMAIN> {

    ENTITY toEntity(DOMAIN domain);

    DOMAIN toDomain(ENTITY entity);

    List<ENTITY> toModels(List<DOMAIN> domains);

    List<DOMAIN> toDomains(List<ENTITY> entitys);

}
