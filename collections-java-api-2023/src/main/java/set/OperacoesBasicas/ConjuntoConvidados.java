package main.java.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionaConvidado(String nome, int codigo ){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.adicionaConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionaConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionaConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionaConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();
        
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
        
        conjuntoConvidados.exibirConvidados();
    }
}
