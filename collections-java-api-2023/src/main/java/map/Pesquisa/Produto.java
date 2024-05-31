package main.java.map.Pesquisa;

public class Produto {
    //atributos
    private String nome;
    private int quantida;
    private double preco;

    public Produto(String nome, int quantida, double preco) {
        this.nome = nome;
        this.quantida = quantida;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantida() {
        return quantida;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantida=" + quantida + ", preco=" + preco + "]";
    }

    
}
