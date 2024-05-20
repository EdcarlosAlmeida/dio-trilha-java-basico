package Dispositivos;

import Interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero:" + numero + " com Telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação com Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz com Telefone");
    }

}
