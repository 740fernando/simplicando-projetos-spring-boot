package com.springbeans.dio.injecaoDependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

    public static void main(String[] args){
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();
    }

    @Autowired // Diz para o spring que é uma injecao de dependencia;
    private Veiculo veiculo;

    public Condutor(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public void automovel(){
        veiculo.acao();
    }
}
