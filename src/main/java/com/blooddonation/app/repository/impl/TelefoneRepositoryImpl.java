package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.Telefone;
import com.blooddonation.app.mapper.TelefoneMapper;
import com.blooddonation.app.model.TelefoneModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.ITelefoneRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TelefoneRepositoryImpl
        extends GenericRepository<TelefoneModel, Telefone, Long> implements ITelefoneRepository {
    
}
