package com.banco.br;

public class ClienteCC extends Cliente{

    float limite;
    float taxa;

    public ClienteCC(int numeroBanco,String agencia, String numeroConta ,String nome,
                     float saldo, char tipo, float limite, float taxa) {
        this.numeroBanco = numeroBanco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
        this.tipo= tipo;
        this.limite = limite;
        this.taxa = taxa;
    }


    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public void informacaoClienteCC() {
        System.out.println("*** Cliente Conta Corrente ***");
        super.informacaoCliente();
        System.out.printf("Limite: %.2f",this.limite);
        System.out.println();
        System.out.printf("Taxa: %.2f",this.taxa);
        System.out.println();

    }
}
