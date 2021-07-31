package com.blooddonation.app.factory;

import com.blooddonation.app.domain.DTO.LocalDoacaoDTO;
import com.blooddonation.app.domain.LocalDoacao;

public class LocalDoacaoFactory {

    public static LocalDoacao cria(LocalDoacaoDTO dto){
        LocalDoacao localDoacao = new LocalDoacao();
        localDoacao.setFuncionamento(dto.getFuncionamento());
        localDoacao.setNome(dto.getNome());

        if(dto.getId() != null)
            localDoacao.setId(Long.valueOf(dto.getId()));
        if(dto.getEndereco() != null)
            localDoacao.setEndereco(EnderecoFactory.cria(dto.getEndereco()));
        if(dto.getTelefone() != null)
            localDoacao.setTelefone(TelefoneFactory.cria(dto.getTelefone()));

        return localDoacao;
    }

}
