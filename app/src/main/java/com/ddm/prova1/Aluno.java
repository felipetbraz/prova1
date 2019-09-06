package com.ddm.prova1;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String nome;
    private Float nota;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNome() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }

    public Float getNota() {
        return nota;
    }
    public void setNota(Float nota) {
        this.nota = nota;
    }

}
