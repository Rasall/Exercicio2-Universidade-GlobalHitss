package com.banco.br;

public class Cliente {
    int numeroBanco;
    String agencia;
    String numeroConta;
    String nome;
    float saldo;
    char tipo;


    public int getNumeroBanco() {
        return numeroBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    protected void informacaoCliente() {
        System.out.printf("Numero do banco: %d",this.numeroBanco);
        System.out.println();
        System.out.println("Agencia: "+this.agencia);
        System.out.println("Conta: "+this.numeroConta);
        System.out.println("Cliente: "+this.nome);
        System.out.printf("Saldo da Conta: %.2f",this.saldo);
        System.out.println();

    }
}
