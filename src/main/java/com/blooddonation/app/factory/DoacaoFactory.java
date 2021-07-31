package com.blooddonation.app.factory;


import com.blooddonation.app.domain.DTO.DoacaoDTO;
import com.blooddonation.app.domain.Doacao;

public class DoacaoFactory {

    public static Doacao cria(DoacaoDTO dto){

        Doacao doacao = new Doacao();
        if(dto.getId() != null)
            doacao.setId(Long.valueOf(dto.getId()));
        doacao.setRegistro(dto.getRegistro());
        return doacao;
    }
}