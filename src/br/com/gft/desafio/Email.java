package br.com.gft.desafio;

import br.com.gft.factoryInterface.Mensagem;

public class Email implements Mensagem {
    @Override
    public void enviar(String msg) {
        System.out.println("Você enviou a seguinte msg por email: "+msg);
    }
}
