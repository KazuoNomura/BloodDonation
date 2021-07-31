package com.blooddonation.app.repository.interfaces;

import com.blooddonation.app.model.DoacaoModel;

import java.util.List;

public interface IDoacaoRepository {

    public List<DoacaoModel> findAllByDoador(Long doador);

    public List<DoacaoModel> findAllByLocal(Long local);

    public List<DoacaoModel> findAllByDoadorAndLocal(Long doador, Long local);
}