package com.blooddonation.app.business;

import com.blooddonation.app.domain.DTO.LocalDoacaoDTO;
import com.blooddonation.app.domain.LocalDoacao;
import com.blooddonation.app.factory.LocalDoacaoFactory;
import com.blooddonation.app.mapper.LocalDoacaoMapper;
import com.blooddonation.app.model.LocalDoacaoModel;
import com.blooddonation.app.repository.impl.LocalDoacaoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class LocalDoacaoBusiness {

    @Autowired
    private LocalDoacaoRepositoryImpl repository;

    @Autowired
    private LocalDoacaoMapper mapper;

    @Transactional
    public LocalDoacao inclusao(LocalDoacaoDTO request) {
        LocalDoacao domain = LocalDoacaoFactory.cria(request);
        return mapper.toDomain(repository.save(mapper.toEntity(domain)));
    }

    @Transactional
    public void delete(String id) {
        repository.delete(Long.valueOf(id));
    }

    @Transactional
    public LocalDoacao update(LocalDoacaoDTO request) {
        LocalDoacao domain = LocalDoacaoFactory.cria(request);
        return mapper.toDomain(repository.update(mapper.toEntity(domain)));
    }

    public Optional<LocalDoacao> findById(String id) {
        Optional<LocalDoacaoModel> model = repository.findById(Long.valueOf(id));
        if(model.isPresent()){
            return Optional.of(mapper.toDomain(model.get()));
        }
        return Optional.ofNullable(null);
    }

    public List<LocalDoacao> getAllByType(String bairro){
        List<LocalDoacao> locais = new ArrayList<>();

        if(bairro != null){
            List<LocalDoacaoModel> models = repository.findAllByType(bairro);
            for (LocalDoacaoModel model : models) {
                locais.add(mapper.toDomain(model));
            }

        } else {
            List<LocalDoacaoModel> models = repository.findAll();
            for (LocalDoacaoModel model : models) {
                locais.add(mapper.toDomain(model));
            }
        }
        return locais;
    }
}
