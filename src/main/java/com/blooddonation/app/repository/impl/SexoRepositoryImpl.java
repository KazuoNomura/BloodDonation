package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.Sexo;
import com.blooddonation.app.mapper.SexoMapper;
import com.blooddonation.app.model.SexoModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.ISexoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SexoRepositoryImpl
        extends GenericRepository<SexoModel, Sexo, Long> implements ISexoRepository {
    
}
