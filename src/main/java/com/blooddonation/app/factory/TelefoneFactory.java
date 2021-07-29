package com.blooddonation.app.factory;

import com.blooddonation.app.domain.DTO.TelefoneDTO;
import com.blooddonation.app.domain.Telefone;

public class TelefoneFactory {

    public static Telefone cria(TelefoneDTO dto){

        Telefone telefone = new Telefone();
        if(dto.getId() != null)
            telefone.setId(Long.valueOf(dto.getId()));
        telefone.setNumero(dto.getNumero());

        return telefone;
    }

}
