package com.blooddonation.app.factory;


import com.blooddonation.app.domain.DTO.TipoSanguineoDTO;
import com.blooddonation.app.domain.TipoSanguineo;

public class TipoSanguineoFactory {

    public static TipoSanguineo cria(TipoSanguineoDTO dto){

        TipoSanguineo tipo = new TipoSanguineo();
        tipo.setId(dto.getCodigo());
        return tipo;
    }

}
