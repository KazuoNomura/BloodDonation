package com.blooddonation.app.factory;

import com.blooddonation.app.domain.DTO.EnderecoDTO;
import com.blooddonation.app.domain.Endereco;

public class EnderecoFactory {

    public static Endereco cria(EnderecoDTO dto){
        Endereco endereco = new Endereco();
        endereco.setBairro(dto.getBairro());
        endereco.setCep(dto.getCep());
        endereco.setCidade(dto.getCidade());
        endereco.setComplemento(dto.getComplemento());
        endereco.setEstado(dto.getEstado());
        endereco.setLogradouro(dto.getLogradouro());
        endereco.setNumero(dto.getNumero());
        
        return endereco;
    }

}
