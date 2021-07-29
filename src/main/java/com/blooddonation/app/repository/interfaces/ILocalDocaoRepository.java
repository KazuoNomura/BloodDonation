package com.blooddonation.app.repository.interfaces;

import com.blooddonation.app.model.LocalDoacaoModel;

import java.util.List;

public interface ILocalDocaoRepository {

    List<LocalDoacaoModel> findAllByType(String bairro);
    
}
