package com.example.CrudEstudantes.service;

import com.example.CrudEstudantes.model.Estudante;

import java.util.List;

public interface EstudanteService {

    public Estudante saveEstudante(Estudante estudante);

    public List<Estudante> getEstudantes();

}
