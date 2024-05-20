package Dispositivos;

import Interfaces.NavegadorInternet;

public class Chrome implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo pagina " + url + " no navegador do Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no navegador do Chrome");
    }

}
