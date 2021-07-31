package com.blooddonation.app.business;

import com.blooddonation.app.domain.DTO.PessoaDTO;
import com.blooddonation.app.domain.Pessoa;
import com.blooddonation.app.factory.PessoaFactory;
import com.blooddonation.app.mapper.PessoaMapper;
import com.blooddonation.app.model.PessoaModel;
import com.blooddonation.app.repository.impl.PessoaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PessoaBusiness {

    @Autowired
    private PessoaRepositoryImpl repository;

    @Autowired
    private PessoaMapper mapper;

    @Transactional
    public Pessoa inclusao(PessoaDTO request){
        Pessoa domain = PessoaFactory.cria(request);
        return mapper.toDomain(repository.save(mapper.toEntity(domain)));
    }

    @Transactional
    public void delete(String id) {
        repository.delete(Long.valueOf(id));
    }

    @Transactional
    public Pessoa update(PessoaDTO request) {
        Pessoa domain = PessoaFactory.cria(request);
        return mapper.toDomain(repository.update(mapper.toEntity(domain)));
    }

    public Optional<Pessoa> findById(String id) {
        Optional<PessoaModel> model = repository.findById(Long.valueOf(id));
        if(model.isPresent()){
            return Optional.of(mapper.toDomain(model.get()));
        }
        return Optional.ofNullable(null);
    }

    public List<Pessoa> getAll() {
        List<Pessoa> locais = new ArrayList<>();
        List<PessoaModel> models = repository.findAll();
        for(PessoaModel model : models){
            locais.add(mapper.toDomain(model));
        }
        return locais;
    }

    public List<Pessoa> getAllByType(Integer tipoSanguineo, Integer sexo) {
        List<Pessoa> locais = new ArrayList<>();

        if (sexo != null && tipoSanguineo != null) {
            List<PessoaModel> models = repository.findAllBySexoAndTipo(Long.valueOf(tipoSanguineo), Long.valueOf(sexo));
            for (PessoaModel model : models) {
                locais.add(mapper.toDomain(model));
            }
        } else if(tipoSanguineo != null){
            List<PessoaModel> models = repository.findAllByTipo(Long.valueOf(tipoSanguineo));
            for (PessoaModel model : models) {
                locais.add(mapper.toDomain(model));
            }

        } else if(sexo != null) {
            List<PessoaModel> models = repository.findAllBySexo(Long.valueOf(sexo));
            for (PessoaModel model : models) {
                locais.add(mapper.toDomain(model));
            }

        } else {
            List<PessoaModel> models = repository.findAll();
            for (PessoaModel model : models) {
                locais.add(mapper.toDomain(model));
            }
        }
        return locais;
    }
}
