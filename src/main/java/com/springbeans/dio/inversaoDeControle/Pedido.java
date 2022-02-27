package com.springbeans.dio.inversaoDeControle;

public class Pedido {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.gravar();
    }

    private EnviarEmails enviar = EnviarEmails.obterDadosEmail();

    public void gravar() {
        this.enviar.obterDadosEmail();
        this.enviar.retornar("Pedido criado!");
    }
}
