package Dispositivos;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando musica com Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando mudica com Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado musica " + musica + " com Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a pagina "+ url + " no navegador do Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no navegador do Iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero + " com Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação com Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz com Iphone");
    }

}
