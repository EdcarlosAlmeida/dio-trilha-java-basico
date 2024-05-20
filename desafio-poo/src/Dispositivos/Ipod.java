package Dispositivos;

import Interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando musica no Ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando mudica no Ipod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado musica" + musica + " no Ipod");
    }

}
