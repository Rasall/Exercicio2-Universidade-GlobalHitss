package com.banco.br;

public class TesteBanco {

    public static void main(String[] args) {

        Banco novoBanco = new Banco("Santander");
        Banco novoBanco2 = new Banco("Bradesco");

        System.out.println(novoBanco.getNome());
        System.out.println(novoBanco.getNumero());

        System.out.println(novoBanco2.getNome());
        System.out.println(novoBanco2.getNumero());

        ClienteCA cliente1 = new ClienteCA(novoBanco.getNumero(), "0001","000152","Mario Bros",250.00f,'P',0.15f);
        ClienteCC cliente2 = new ClienteCC(novoBanco2.getNumero(), "0034","001234","Terry Crews",515.00f,'C',1000.00f, 1.75f);

        cliente1.informacaoClienteCA();
        cliente2.informacaoClienteCC();
    }
}
