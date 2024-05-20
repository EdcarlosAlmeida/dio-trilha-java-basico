package Dispositivos;

import Interfaces.ReprodutorMusical;

public class Mp3 implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando musica no Mp3");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando mudica no Mp3");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado musica " + musica + " no Mp3");
    }
}
