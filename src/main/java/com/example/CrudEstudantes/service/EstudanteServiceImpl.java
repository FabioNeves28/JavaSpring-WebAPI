package com.example.CrudEstudantes.service;

import com.example.CrudEstudantes.model.Estudante;
import com.example.CrudEstudantes.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteServiceImpl implements EstudanteService{

    @Autowired
    private EstudanteRepository estudanteRepository;

    @Override
    public Estudante saveEstudante(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    @Override
    public List<Estudante> getEstudantes() {
        return estudanteRepository.findAll();
    }
}
