package com.example.CrudEstudantes.repository;

import com.example.CrudEstudantes.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository  extends JpaRepository<Escola, Integer> {
}
