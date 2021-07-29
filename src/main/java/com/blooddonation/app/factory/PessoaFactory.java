package com.blooddonation.app.factory;


import com.blooddonation.app.domain.DTO.PessoaDTO;
import com.blooddonation.app.domain.Pessoa;

public class PessoaFactory {

    public static Pessoa cria(PessoaDTO dto){
        Pessoa pessoa = new Pessoa();
        if(dto.getId() != null)
            pessoa.setId(Long.valueOf(dto.getId()));
        pessoa.setCpf(dto.getCpf());
        pessoa.setNome(dto.getNome());
        pessoa.setSobrenome(dto.getSobrenome());
        pessoa.setRg(dto.getRg());
        if(dto.getEndereco() != null)
            pessoa.setEndereco(EnderecoFactory.cria(dto.getEndereco()));
        if(dto.getTelefone() != null)
            pessoa.setTelefone(TelefoneFactory.cria(dto.getTelefone()));
        if(dto.getSexo() != null)
            pessoa.setSexo(SexoFactory.cria(dto.getSexo()));
        if(dto.getTipo() != null)
            pessoa.setTipo(TipoSanguineoFactory.cria(dto.getTipo()));


        return pessoa;
    }

}
