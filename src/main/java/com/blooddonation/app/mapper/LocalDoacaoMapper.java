package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.LocalDoacao;
import com.blooddonation.app.model.LocalDoacaoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocalDoacaoMapper{

    @Autowired
    private TelefoneMapper telefoneMapper;

    @Autowired
    private EnderecoMapper enderecoMapper;

    public LocalDoacaoModel toEntity(LocalDoacao domain){
        LocalDoacaoModel model = new LocalDoacaoModel();
        model.setId(domain.getId());
        model.setFuncionamento(domain.getFuncionamento());
        model.setNome(domain.getNome());
        if(domain.getTelefone() != null)
            model.setTelefone(telefoneMapper.toEntity(domain.getTelefone()));
        if(domain.getEndereco() != null)
            model.setEndereco(enderecoMapper.toEntity(domain.getEndereco()));
        return model;
    }

    public LocalDoacao toDomain(LocalDoacaoModel model){
        LocalDoacao domain = new LocalDoacao();
        domain.setId(model.getId());
        domain.setFuncionamento(model.getFuncionamento());
        domain.setNome(model.getNome());
        if(model.getTelefone() != null)
            domain.setTelefone(telefoneMapper.toDomain(model.getTelefone()));
        if(model.getEndereco() != null)
            domain.setEndereco(enderecoMapper.toDomain(model.getEndereco()));
        return domain;
    }

}
