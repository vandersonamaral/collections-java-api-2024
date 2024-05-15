package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                total += produto.getPreco()*produto.getQuantidade();
            }
        }
        return total;

    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaiscaro=null;
        if (!estoqueProdutosMap.isEmpty()) {
            double maiorPreco = Double.MIN_VALUE;
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaiscaro = produto;
                }

            }
        }
        return produtoMaiscaro;
    }
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato=null;
        if (!estoqueProdutosMap.isEmpty()) {
            double menorPreco = Double.MAX_VALUE;
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                }

            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }

}
