package com.blooddonation.app.business;

import com.blooddonation.app.domain.DTO.DoacaoDTO;
import com.blooddonation.app.domain.Doacao;
import com.blooddonation.app.domain.LocalDoacao;

import com.blooddonation.app.domain.Pessoa;
import com.blooddonation.app.factory.DoacaoFactory;
import com.blooddonation.app.mapper.DoacaoMapper;
import com.blooddonation.app.model.DoacaoModel;
import com.blooddonation.app.repository.impl.DoacaoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DoacaoBusiness {

    @Autowired
    private DoacaoRepositoryImpl repository;

    @Autowired
    private DoacaoMapper mapper;

    @Autowired
    private PessoaBusiness pessoaBusiness;

    @Autowired
    private LocalDoacaoBusiness localDoacaoBusiness;

    @Transactional
    public Doacao inclusao(DoacaoDTO request){
        Doacao domain = DoacaoFactory.cria(request);
        Optional<Pessoa> doador = pessoaBusiness.findById(request.getCodigo_doador().toString());
        if(doador.isPresent())
            domain.setDoador(doador.get());
        //else
            //Jogar exception
        Optional<LocalDoacao> local = localDoacaoBusiness.findById(request.getCodigo_localDoacao().toString());
        if(local.isPresent())
            domain.setLocalDoacao(local.get());
        //else
            //Jogar exception

        return mapper.toDomain(repository.save(mapper.toEntity(domain)));
    }

    @Transactional
    public Doacao update(DoacaoDTO request) {
        Doacao domain = DoacaoFactory.cria(request);
        if(request.getCodigo_doador() != null) {
            Optional<Pessoa> doador = pessoaBusiness.findById(request.getCodigo_doador().toString());
            if (doador.isPresent())
                domain.setDoador(doador.get());
        }
        if(request.getCodigo_doador() != null) {
            Optional<LocalDoacao> local = localDoacaoBusiness.findById(request.getCodigo_localDoacao().toString());
            if (local.isPresent())
                domain.setLocalDoacao(local.get());
        }
        return mapper.toDomain(repository.update(mapper.toEntity(domain)));
    }

    public List<Doacao> getAllByType(String doador, String local) {
        List<Doacao> doacoes = new ArrayList<>();

        if (local != null && doador != null){
            List<DoacaoModel> models = repository.findAllByDoadorAndLocal(Long.valueOf(doador), Long.valueOf(local));
            for (DoacaoModel model : models) {
                doacoes.add(mapper.toDomain(model));
            }
        } else if(doador != null){
            List<DoacaoModel> models = repository.findAllByDoador(Long.valueOf(doador));
            for (DoacaoModel model : models) {
                doacoes.add(mapper.toDomain(model));
            }
        } else if(local != null) {
            List<DoacaoModel> models = repository.findAllByLocal(Long.valueOf(local));
            for (DoacaoModel model : models) {
                doacoes.add(mapper.toDomain(model));
            }

        } else {
            List<DoacaoModel> models = repository.findAll();
            for (DoacaoModel model : models) {
                doacoes.add(mapper.toDomain(model));
            }
        }

        return doacoes;
    }
}