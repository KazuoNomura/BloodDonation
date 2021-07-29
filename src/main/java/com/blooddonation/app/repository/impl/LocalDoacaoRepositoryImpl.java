package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.LocalDoacao;
import com.blooddonation.app.mapper.LocalDoacaoMapper;
import com.blooddonation.app.model.LocalDoacaoModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.ILocalDocaoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class LocalDoacaoRepositoryImpl
        extends GenericRepository<LocalDoacaoModel, LocalDoacao, Long> implements ILocalDocaoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<LocalDoacaoModel> findAll(){
        List resultList = entityManager
                .createQuery("Select t from LocalDoacaoModel t", LocalDoacaoModel.class)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<LocalDoacaoModel> findAllByType(String bairro) {
        List resultList = entityManager
                .createQuery("Select t from LocalDoacaoModel t WHERE t.endereco.bairro = :bairro", LocalDoacaoModel.class)
                .setParameter("bairro", bairro)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }
}
