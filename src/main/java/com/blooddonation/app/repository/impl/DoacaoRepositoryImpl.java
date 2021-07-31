package com.blooddonation.app.repository.impl;

import com.blooddonation.app.domain.Doacao;
import com.blooddonation.app.model.DoacaoModel;
import com.blooddonation.app.model.PessoaModel;
import com.blooddonation.app.repository.GenericRepository;
import com.blooddonation.app.repository.interfaces.IDoacaoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class DoacaoRepositoryImpl
        extends GenericRepository<DoacaoModel, Doacao, Long> implements IDoacaoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DoacaoModel> findAll(){
        List resultList = entityManager
                .createQuery("Select t from DoacaoModel t", DoacaoModel.class)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<DoacaoModel> findAllByDoador(Long doador) {
        List resultList = entityManager
                .createQuery("Select t from DoacaoModel t WHERE t.doador.id = :doador", DoacaoModel.class)
                .setParameter("doador", doador)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<DoacaoModel> findAllByLocal(Long local) {
        List resultList = entityManager
                .createQuery("Select t from DoacaoModel t WHERE t.localDoacao.id = :local", DoacaoModel.class)
                .setParameter("local", local)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<DoacaoModel> findAllByDoadorAndLocal(Long doador, Long local) {
        List resultList = entityManager
                .createQuery("Select t from DoacaoModel t WHERE t.localDoacao.id = :local AND t.doador.id = :doador", DoacaoModel.class)
                .setParameter("doador", doador)
                .setParameter("local", local)
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }
    
}
