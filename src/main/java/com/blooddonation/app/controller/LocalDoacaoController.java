package com.blooddonation.app.controller;

import com.blooddonation.app.business.LocalDoacaoBusiness;
import com.blooddonation.app.domain.DTO.LocalDoacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
//
//    @GetMapping(path = "/locais", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> getDoadores(){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.OK).body(localDoacaoBusiness.getAll());
//    }
//
//    @GetMapping(path = "/locais", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> getDoadoresPorEndereco(@RequestParam(required = false, value = "bairro") String bairro,
//                                                  @RequestParam(required = false, value = "cidade") Integer cidade){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.OK).body(localDoacaoBusiness.getAllByType(bairro, cidade));
//    }
//
//    @PatchMapping(path = "/locais/{id}", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> updateById(@RequestBody final LocalDoacaoDTO request, @PathVariable(value = "id") String id){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(localDoacaoBusiness.update(request, id));
//    }
//
//    @DeleteMapping(path = "/locais/{id}", produces = "application/json")
//    public @ResponseBody
//    ResponseEntity<Object> deleteById(@PathVariable(value = "id") String cpf){
//
//        System.out.println(LOG_CLASS + "GET");
//
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(localDoacaoBusiness.delete(id));
//    }
}
