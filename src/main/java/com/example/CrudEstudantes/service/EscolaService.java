package com.example.CrudEstudantes.service;

import com.example.CrudEstudantes.model.Escola;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface EscolaService {

    public Escola salvarEscola(Escola escola);

    public List<Escola> listarEscolas();


}