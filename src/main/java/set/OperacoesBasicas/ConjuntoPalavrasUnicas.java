package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicas = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()){
            if (palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            }
            else {
                System.out.println("Palavra nao encontrada");
            }
        }
        else {
            System.out.println("O conjunto está vazio!");

        }
    }
    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicas.isEmpty()){
            System.out.println(palavrasUnicas);
        }
        else{
            System.out.println("Conjunto vazio !");
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");


        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

    }

}
