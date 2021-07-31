package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Doacao;
import com.blooddonation.app.domain.LocalDoacao;
import com.blooddonation.app.model.DoacaoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoacaoMapper {

    @Autowired
    private PessoaMapper pessoaMapper;

    @Autowired
    private LocalDoacaoMapper localDoacaoMapper;

    public DoacaoModel toEntity(Doacao domain) {

        DoacaoModel model = new DoacaoModel();
        model.setId(domain.getId());
        model.setRegistro(domain.getRegistro());
        if(domain.getDoador() != null)
            model.setDoador(pessoaMapper.toEntity(domain.getDoador()));
        if(domain.getLocalDoacao() != null)
            model.setLocalDoacao(localDoacaoMapper.toEntity(domain.getLocalDoacao()));
        return model;
    }

    public Doacao toDomain(DoacaoModel model) {
        Doacao domain = new Doacao();
        domain.setId(model.getId());
        domain.setRegistro(model.getRegistro());
        if(model.getDoador() != null)
            domain.setDoador(pessoaMapper.toDomain(model.getDoador()));
        if(model.getLocalDoacao() != null)
            domain.setLocalDoacao(localDoacaoMapper.toDomain(model.getLocalDoacao()));
        return domain;

    }

}
