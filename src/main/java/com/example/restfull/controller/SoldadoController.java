package com.example.restfull.controller;

import com.example.restfull.controller.request.SoldadoEdit;
import com.example.restfull.dto.Soldado;
import com.example.restfull.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    //injecao de dependencia


    public SoldadoController(SoldadoService soldadoService){
    this.soldadoService=soldadoService;
    }

    //buscar um soldado
    @GetMapping("/{cpf}")
   public ResponseEntity<Soldado> buscarSoldado(@PathVariable() String cpf ){
      Soldado soldado= soldadoService.buscarSoldado(cpf);
       return ResponseEntity.status(HttpStatus.OK).body(soldado);
   }

    @PostMapping("/criar")
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){
    soldadoService.criarSoldado(soldado);
    return ResponseEntity.status(HttpStatus.CREATED).build();
   }

   @PutMapping("/{cpf}")
    public ResponseEntity editarSoldado(@PathVariable() String cpf,
                                        @RequestBody SoldadoEdit soldadoEdit){
    soldadoService.alterarSoldado(cpf,soldadoEdit);
 return ResponseEntity.ok().build();
   }
    @DeleteMapping("/{cpf}")
    public ResponseEntity deletarSoldado(@PathVariable String cpf){
    soldadoService.deletarSoldado(cpf);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/todos")
    public ResponseEntity <List<Soldado>> buscarTodosSoldados(){
        List<Soldado> soldado= soldadoService.buscarTodosSoldados();
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }
}
