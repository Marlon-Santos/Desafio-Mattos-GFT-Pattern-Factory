package br.com.gft.main;

import br.com.gft.desafio.FactoryMsg;

public class Main {

    public static void main(String[] args) {
        try{
            FactoryMsg.modoEnvio(1).enviar("Desafio do Mattos completo!!!");
            FactoryMsg.modoEnvio(2).enviar("Desafio do Mattos completo!!!");
            FactoryMsg.modoEnvio(3).enviar("Desafio do Mattos completo!!!");
        }catch (Exception e){
            System.out.println("Opção invalida !!!");
        }
    }
}
