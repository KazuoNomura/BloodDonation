package com.blooddonation.app.business;

import com.blooddonation.app.domain.DTO.DoacaoDTO;
import com.blooddonation.app.domain.Doacao;
import com.blooddonation.app.domain.Pessoa;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DoacaoBusiness {

    public Doacao inclusao(DoacaoDTO pessoa){
        return null;
    }

    public List<Pessoa> getAll() {
        return null;
    }

    public List<Pessoa> getAllByType(Integer tipoSanguineo) {
        return null;
    }
}
