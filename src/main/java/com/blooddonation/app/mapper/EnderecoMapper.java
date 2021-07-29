package com.blooddonation.app.mapper;

import com.blooddonation.app.domain.Endereco;
import com.blooddonation.app.mapper.configurations.DefaultMapperConfiguration;
import com.blooddonation.app.model.EnderecoModel;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
public class EnderecoMapper{

    public EnderecoModel toEntity(Endereco domain) {
        EnderecoModel model = new EnderecoModel();
        model.setId(domain.getId());
        model.setBairro(domain.getBairro());
        model.setCep(domain.getCep());
        model.setCidade(domain.getCidade());
        model.setComplemento(domain.getComplemento());
        model.setEstado(domain.getEstado());
        model.setLogradouro(domain.getLogradouro());
        model.setNumero(domain.getNumero());
        return model;
    }

    public Endereco toDomain(EnderecoModel model) {
        Endereco domain = new Endereco();
        domain.setId(model.getId());
        domain.setBairro(model.getBairro());
        domain.setCep(model.getCep());
        domain.setCidade(model.getCidade());
        domain.setComplemento(model.getComplemento());
        domain.setEstado(model.getEstado());
        domain.setLogradouro(model.getLogradouro());
        domain.setNumero(model.getNumero());
        return domain;
    }

}
