package com.example.CrudEstudantes.model;

import jakarta.persistence.*;

@Entity
public class Escola {
    public int getId_escola() {
        return id_escola;
    }

    public void setId_escola(int id_escola) {
        this.id_escola = id_escola;
    }

    public String getNome_escola() {
        return nome_escola;
    }

    public void setNome_escola(String nome_escola) {
        this.nome_escola = nome_escola;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_escola;
    private String nome_escola;

    }
