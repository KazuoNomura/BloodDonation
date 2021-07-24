package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.LocalDoacao;
import com.blooddonation.app.mapper.LocalDoacaoMapper;
import com.blooddonation.app.model.LocalDoacaoModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.ILocalDocaoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LocalDoacaoRepositoryImpl
        extends GenericRepository<LocalDoacaoModel, LocalDoacao, Long, LocalDoacaoMapper> implements ILocalDocaoRepository {
    
}
