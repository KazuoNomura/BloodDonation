package com.blooddonation.app.business;

import com.blooddonation.app.domain.DTO.LocalDoacaoDTO;
import com.blooddonation.app.domain.LocalDoacao;
import com.blooddonation.app.factory.LocalDoacaoFactory;
import com.blooddonation.app.mapper.LocalDoacaoMapper;
import com.blooddonation.app.repository.impl.LocalDoacaoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LocalDoacaoBusiness {

    @Autowired
    private LocalDoacaoRepositoryImpl repository;

    @Transactional
    public LocalDoacao inclusao(LocalDoacaoDTO request) {
        LocalDoacao local = LocalDoacaoFactory.cria(request);
        return repository.save(local);
    }
}
