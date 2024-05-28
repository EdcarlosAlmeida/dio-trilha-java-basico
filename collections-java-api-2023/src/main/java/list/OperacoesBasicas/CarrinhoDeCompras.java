package main.java.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i: itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemRemover.add(i);
                }
            }
            itemList.removeAll(itemRemover);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotalCarrinho = 0;
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                valorTotalCarrinho = valorTotalCarrinho + (i.getPreco() * i.getQuantidade());
            }
            return valorTotalCarrinho;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        System.out.println(itemList);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Melancia", 5, 2);
        carrinhoDeCompras.adicionarItem("Laranja", 1, 5);
        carrinhoDeCompras.adicionarItem("Abacate", 10, 5);
        

        System.out.println("Valor total do itens no carrinho :" + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Laranja");
        carrinhoDeCompras.exibirItens();
    }
}
