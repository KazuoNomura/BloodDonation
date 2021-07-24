package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.Endereco;
import com.blooddonation.app.mapper.EnderecoMapper;
import com.blooddonation.app.model.EnderecoModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.IEnderecoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnderecoRepositoryImpl
        extends GenericRepository<EnderecoModel, Endereco, Long, EnderecoMapper> implements IEnderecoRepository {
    
}
