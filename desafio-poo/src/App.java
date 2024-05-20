import Dispositivos.Chrome;
import Dispositivos.Iphone;
import Dispositivos.Telefone;
import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone =  new Iphone();

        iphone.selecionarMusica("Nothing Else Matters - Metallica ");
        iphone.tocar();
        iphone.ligar("2345678");

        System.out.println("\n");

        ReprodutorMusical reprodutorMusical = iphone;
        reprodutorMusical.selecionarMusica("The Unforgiven - Metallica ");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        System.out.println("\n");

        AparelhoTelefonico aparelhoTelefonico = iphone;
        aparelhoTelefonico.ligar("2345678");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.println("\n");

        NavegadorInternet navegadorInternet = iphone;
        navegadorInternet.exibirPagina("www.web.dio.me");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        System.out.println("\n");

        Chrome chrome = new Chrome();
        chrome.exibirPagina("www.web.dio.me");
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();

        System.out.println("\n");

        Telefone telefone = new Telefone();
        telefone.ligar("2345678");
        telefone.atender();
        telefone.iniciarCorreioVoz();

    }
}
