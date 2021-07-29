package com.blooddonation.app.repository.interfaces;

import com.blooddonation.app.model.PessoaModel;

import java.util.List;

public interface IPessoaRepository {

    List<PessoaModel> findAllByTipo(Long tipo);

    List<PessoaModel> findAllBySexo(Long sexo);

    List<PessoaModel> findAllBySexoAndTipo(Long tipo, Long sexo);
    
}
