package com.banco.br;

public class Banco {
    String nome;
    private static int sequencia;
    int numero;

    public Banco(String nome) {
        this.nome = nome;
        this.numero =sequencia++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

}
