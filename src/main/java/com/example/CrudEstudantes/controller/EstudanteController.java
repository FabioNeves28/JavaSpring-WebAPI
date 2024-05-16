package com.example.CrudEstudantes.controller;
import com.example.CrudEstudantes.model.Estudante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.CrudEstudantes.service.EstudanteService;

import java.util.List;

@RestController
@RequestMapping("/estudante")
@CrossOrigin
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @RequestMapping("/adicionar")
    public String adicionarEstudante(@RequestBody Estudante estudante){
        estudanteService.saveEstudante(estudante);
        return "Estudante adicionado com sucesso!";

    }
    @RequestMapping("/listar")
    public List<Estudante> listarEstudantes(){

        if(estudanteService.getEstudantes().isEmpty()){
            return null;
        }
        return estudanteService.getEstudantes();
    }
}
