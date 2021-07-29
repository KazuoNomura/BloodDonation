package com.blooddonation.app.controller;

import com.blooddonation.app.business.LocalDoacaoBusiness;
import com.blooddonation.app.domain.DTO.LocalDoacaoDTO;
import com.blooddonation.app.domain.LocalDoacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("blood_donation/v1")
public class LocalDoacaoController {

    private static final String LOG_CODE = "LOCAL_DOACAO";
    private static final String LOG_CLASS = "[LOCAL_DOACAO_CONTROLLER] - ";

    @Autowired
    private LocalDoacaoBusiness localDoacaoBusiness;

    @PostMapping(path = "/locais", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> post(@RequestBody final LocalDoacaoDTO request){

        System.out.println(LOG_CLASS + "POST");

        return ResponseEntity.status(HttpStatus.CREATED).body(localDoacaoBusiness.inclusao(request));
    }

    @GetMapping(path = "/locais", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> getDoadoresPorEndereco(@RequestParam(required = false, value = "bairro") String bairro){

        System.out.println(LOG_CLASS + "GET");

        return ResponseEntity.status(HttpStatus.OK).body(localDoacaoBusiness.getAllByType(bairro));
    }

    @PatchMapping(path = "/locais/", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> updateById(@RequestBody final LocalDoacaoDTO request){

        System.out.println(LOG_CLASS + "PATCH");

        Optional<LocalDoacao> domain = localDoacaoBusiness.findById(request.getId());
        if(domain.isPresent()) {

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(localDoacaoBusiness.update(request));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND");
    }

    @DeleteMapping(path = "/locais/{id}", produces = "application/json")
    public @ResponseBody
    ResponseEntity<Object> deleteById(@PathVariable(value = "id") String id){

        System.out.println(LOG_CLASS + "DELETE");
        Optional<LocalDoacao> domain = localDoacaoBusiness.findById(id);
        if(domain.isPresent()) {

            localDoacaoBusiness.delete(id);

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deletado com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND");
    }
}