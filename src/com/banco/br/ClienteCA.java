package com.banco.br;

public class ClienteCA extends Cliente {

    float taxaDeRendimento;

    public ClienteCA(int numeroBanco,String agencia, String numeroConta ,String nome,
                     float saldo, char tipo, float taxaDeRendimento) {
        this.numeroBanco = numeroBanco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
        this.tipo= tipo;
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public float getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(float taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void informacaoClienteCA() {
        System.out.println("*** Cliente Conta poupaca ***");
        super.informacaoCliente();
        System.out.printf("Taxa de Rendimento: %.2f",this.taxaDeRendimento);
        System.out.println();
        System.out.println();
    }
}