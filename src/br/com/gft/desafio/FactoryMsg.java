package br.com.gft.desafio;

import br.com.gft.factoryInterface.Mensagem;

public class FactoryMsg{
    public static Mensagem modoEnvio(int escolha){
        Mensagem tipo = null;
        switch (escolha){
            case 1:
               tipo = new Email();
                break;
            case 2:
                tipo = new Sms();
            break;
            default:
                tipo = null;
        }
        return tipo;
    }
}
