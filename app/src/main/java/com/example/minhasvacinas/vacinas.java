package com.example.minhasvacinas;
import java.io.Serializable;

class Vacina implements Serializable {

    private static final long serialVersionId = 1L;
    private int id;
    private String nome;


    public Vacina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}

