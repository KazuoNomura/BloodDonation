package com.blooddonation.app.controller;

import com.blooddonation.app.business.DoacaoBusiness;
import com.blooddonation.app.domain.DTO.DoacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("blood_donation/v1")
public class RegistroDoacaoController {

    private static final String LOG_CODE = "REGISTRO_DOACAO";
    private static final String LOG_CLASS = "[REGISTRO_DOACAO_CONTROLLER] - ";

    @Autowired
    private DoacaoBusiness doacaoBusiness;

    @PostMapping(path = "/doacoes", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> post(@RequestBody final DoacaoDTO request){

        System.out.println(LOG_CLASS + "POST");

        return ResponseEntity.status(HttpStatus.CREATED).body(doacaoBusiness.inclusao(request));
    }

    @GetMapping(path = "/doacoes", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> getDoadores(@RequestParam(required = false, value = "doador") String doador, @RequestParam(required = false, value = "local") String local){

        System.out.println(LOG_CLASS + "GET");

        return ResponseEntity.status(HttpStatus.OK).body(doacaoBusiness.getAllByType(doador, local));
    }

    @PatchMapping(path = "/doacoes", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> updateById(@RequestBody final DoacaoDTO request){

        System.out.println(LOG_CLASS + "GET");

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(doacaoBusiness.update(request));
    }
}
