package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.Doacao;
import com.blooddonation.app.mapper.DoacaoMapper;
import com.blooddonation.app.model.DoacaoModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.IDoacaoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DoacaoRepositoryImpl
        extends GenericRepository<DoacaoModel, Doacao, Long, DoacaoMapper> implements IDoacaoRepository {
    
}
