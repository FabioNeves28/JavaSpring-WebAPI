package com.example.CrudEstudantes.repository;

import com.example.CrudEstudantes.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {
}
