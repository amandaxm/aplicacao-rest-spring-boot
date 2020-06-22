package com.example.restfull.service;

import com.example.restfull.controller.request.SoldadoEdit;
import com.example.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {


    public Soldado buscarSoldado(String cpf){
        Soldado soldado= new Soldado();
        soldado.setCpf(cpf);
        soldado.setName("Carlos");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flecha");
        return soldado;

    }

    public void criarSoldado(Soldado soldado){


    }

    public void alterarSoldado(String cpf, SoldadoEdit soldadoEdit) {

    }

    public void deletarSoldado(String cpf) {

    }

    public List<Soldado> buscarTodosSoldados() {
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("132322323");
        soldado1.setName("Carlos");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e Flecha");

        Soldado soldado2 = new Soldado();
        soldado2.setCpf("000000000");
        soldado2.setName("Joao");
        soldado2.setRaca("Humano");
        soldado2.setArma("Enxada");


return Arrays.asList(soldado1,soldado2);

    }
}
