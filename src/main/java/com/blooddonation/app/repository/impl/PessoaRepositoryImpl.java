package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.Pessoa;
import com.blooddonation.app.model.PessoaModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.IPessoaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class PessoaRepositoryImpl
        extends GenericRepository<PessoaModel, Pessoa, Long> implements IPessoaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<PessoaModel> findAll(){
        List resultList = entityManager
                .createQuery("Select t from PessoaModel t", PessoaModel.class)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<PessoaModel> findAllByTipo(Long tipo) {
        List resultList = entityManager
                .createQuery("Select t from PessoaModel t WHERE t.tipo.id = :tipo", PessoaModel.class)
                .setParameter("tipo", tipo)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<PessoaModel> findAllBySexo(Long sexo) {
        List resultList = entityManager
                .createQuery("Select t from PessoaModel t WHERE t.sexo.id = :sexo", PessoaModel.class)
                .setParameter("sexo", sexo)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<PessoaModel> findAllBySexoAndTipo(Long tipo, Long sexo) {
        List resultList = entityManager
                .createQuery("Select t from PessoaModel t WHERE t.sexo.id = :sexo AND t.tipo.id = :tipo", PessoaModel.class)
                .setParameter("tipo", tipo)
                .setParameter("sexo", sexo)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }


}
