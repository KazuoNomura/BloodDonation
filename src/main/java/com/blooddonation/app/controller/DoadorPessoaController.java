package com.blooddonation.app.controller;

import com.blooddonation.app.business.PessoaBusiness;
import com.blooddonation.app.domain.DTO.PessoaDTO;
import com.blooddonation.app.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("blood_donation/v1")
public class DoadorPessoaController {

    private static final String LOG_CODE = "DOADOR_PESSOA";
    private static final String LOG_CLASS = "[DOADOR_PESSOA_CONTROLLER] - ";

    @Autowired
    private PessoaBusiness pessoaBusiness;

    @PostMapping(path = "/doadores", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> post(@RequestBody final PessoaDTO request){

        System.out.println(LOG_CLASS + "POST");

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaBusiness.inclusao(request));
    }

    @GetMapping(path = "/doadores", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> getDoadores(@RequestParam(required = false, value = "tipo_sanguineo") Integer tipoSanguineo, @RequestParam(required = false, value = "sexo") Integer sexo){

        System.out.println(LOG_CLASS + "GET");

        return ResponseEntity.status(HttpStatus.OK).body(pessoaBusiness.getAllByType(tipoSanguineo, sexo));
    }

    @PatchMapping(path = "/doadores/", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> update(@RequestBody final PessoaDTO request){

        System.out.println(LOG_CLASS + "PATCH");

        Optional<Pessoa> domain = pessoaBusiness.findById(request.getId());
        if(domain.isPresent()) {

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(pessoaBusiness.update(request));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND");
    }

    @DeleteMapping(path = "/doadores/{id}", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> deleteById(@PathVariable(value = "id") String id){

        System.out.println(LOG_CLASS + "DELETE");
        Optional<Pessoa> domain = pessoaBusiness.findById(id);
        if(domain.isPresent()) {

            pessoaBusiness.delete(id);

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deletado com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND");
    }

}