package com.example.CrudEstudantes.service;

import com.example.CrudEstudantes.model.Escola;
import com.example.CrudEstudantes.repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EscolaServiceImpl implements EscolaService{

    @Autowired
    private EscolaRepository _escolaRepository;

    @Override
    public Escola salvarEscola(Escola escola) {
        return _escolaRepository.save(escola);
    }

    @Override
    public List<Escola> listarEscolas() {
        return _escolaRepository.findAll();
    }
}
