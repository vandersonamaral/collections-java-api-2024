package main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemlist;

    public CarrinhoDeCompras() {
        itemlist = new ArrayList<Item>();
    }

    public void adicionarItem(String nome , double preco, int quantidade){
        itemlist.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List <Item> itemParaRemover= new ArrayList<>();
        for (Item item : itemlist){
            if (item.getNome().equals(nome)){
                itemParaRemover.add(item);
            }
        }
        itemlist.removeAll(itemParaRemover);

    }
    public double calcularValorTotal() {
        double total = 0;
        if (!itemlist.isEmpty()){
            for (Item item : itemlist) {
                double Valoritem = item.getPreco() * item.getQuantidade();
                total += Valoritem;
            }
            return total;
        }

        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void imprimirLista(){
        if (!itemlist.isEmpty()){
            System.out.println(itemlist);
        }
        else
            System.out.println("Lista vazia .");

    }

    @Override
    public String toString() {
        return "CarrinhoDECompras{" +
                "itemlist=" + itemlist +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras =new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("cama",1000,8);
        carrinhoDeCompras.adicionarItem("sofa",3000,4);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.imprimirLista();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.imprimirLista();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
