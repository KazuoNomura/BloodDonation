package com.blooddonation.app.factory;


import com.blooddonation.app.domain.DTO.SexoDTO;
import com.blooddonation.app.domain.Sexo;

public class SexoFactory {

    public static Sexo cria(SexoDTO dto){

        Sexo sexo = new Sexo();
        sexo.setId(dto.getCodigo());
        return sexo;
    }

}
