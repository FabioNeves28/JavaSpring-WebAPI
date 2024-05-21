package com.example.CrudEstudantes.service;

import com.example.CrudEstudantes.model.Escola;
import com.example.CrudEstudantes.model.Estudante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstudanteService {

    public Estudante saveEstudante(Estudante estudante);

    public List<Estudante> getEstudantes();


}
