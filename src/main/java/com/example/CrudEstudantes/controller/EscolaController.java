package com.example.CrudEstudantes.controller;
import com.example.CrudEstudantes.model.Escola;
import com.example.CrudEstudantes.service.EscolaService;
import com.example.CrudEstudantes.service.EscolaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/escola")
@CrossOrigin
public class EscolaController {

    @Qualifier("escolaServiceImpl")
    @Autowired
    private EscolaService _escolaService;

    @RequestMapping("/listar")
    public List<Escola> listarEscolas() {
        if (_escolaService.listarEscolas().isEmpty()) {
            return null;
        }
        return _escolaService.listarEscolas();

    }

    @RequestMapping("/adicionar")
    public String adicionarEscola(@RequestBody Escola escola) {
        _escolaService.salvarEscola(escola);
        return "Escola adicionada com sucesso!";
    }
}
