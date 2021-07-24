package com.blooddonation.app.controller;

import com.blooddonation.app.business.PessoaBusiness;
import com.blooddonation.app.domain.DTO.PessoaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    ResponseEntity<Object> getDoadores(){

        System.out.println(LOG_CLASS + "GET");

        return ResponseEntity.status(HttpStatus.OK).body(pessoaBusiness.getAll());
    }

//    @GetMapping(path = "/doadores", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> getDoadoresPorTipo(@RequestParam(required = false, value = "tipo_sanguineo") Integer tipoSanguineo){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.OK).body(pessoaBusiness.getAllByType(tipoSanguineo));
//    }

//    @GetMapping(path = "/doadores/{cpf}", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> findByCPF(@PathVariable(value = "cpf") String cpf){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.OK).body(pessoaBusiness.getByCpf(cpf));
//    }
//
//    @PatchMapping(path = "/doadores/{cpf}", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> updateByCPF(@RequestBody final PessoaDTO request, @PathVariable(value = "cpf") String cpf){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(pessoaBusiness.updateByCpf(request, cpf));
//    }
//
//    @DeleteMapping(path = "/doadores/{cpf}", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> deleteByCPF(@PathVariable(value = "cpf") String cpf){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(pessoaBusiness.deleteByCpf(cpf));
//    }

}