package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Pessoa;
import com.blooddonation.app.model.PessoaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapper{

    @Autowired
    private TelefoneMapper telefoneMapper;

    @Autowired
    private EnderecoMapper enderecoMapper;

    @Autowired
    private SexoMapper sexoMapper;

    @Autowired
    private TipoSanguineoMapper tipoSanguineoMapper;

    public PessoaModel toEntity(Pessoa domain) {

        PessoaModel model = new PessoaModel();
        model.setId(domain.getId());
        model.setCpf(domain.getCpf());
        model.setRg(domain.getRg());
        model.setNome(domain.getNome());
        model.setSobrenome(domain.getSobrenome());
        if(domain.getTelefone() != null)
            model.setTelefone(telefoneMapper.toEntity(domain.getTelefone()));
        if(domain.getEndereco() != null)
            model.setEndereco(enderecoMapper.toEntity(domain.getEndereco()));
        if(domain.getSexo() != null)
            model.setSexo(sexoMapper.toEntity(domain.getSexo()));
        if(domain.getTipo() != null)
            model.setTipo(tipoSanguineoMapper.toEntity(domain.getTipo()));
        return model;

    }

    public Pessoa toDomain(PessoaModel model) {
        Pessoa domain = new Pessoa();
        domain.setId(model.getId());
        domain.setCpf(model.getCpf());
        domain.setRg(model.getRg());
        domain.setNome(model.getNome());
        domain.setSobrenome(model.getSobrenome());
        if(model.getTelefone() != null)
            domain.setTelefone(telefoneMapper.toDomain(model.getTelefone()));
        if(model.getEndereco() != null)
            domain.setEndereco(enderecoMapper.toDomain(model.getEndereco()));
        if(model.getSexo() != null)
            domain.setSexo(sexoMapper.toDomain(model.getSexo()));
        if(model.getTipo() != null)
            domain.setTipo(tipoSanguineoMapper.toDomain(model.getTipo()));
        return domain;
    }

}
