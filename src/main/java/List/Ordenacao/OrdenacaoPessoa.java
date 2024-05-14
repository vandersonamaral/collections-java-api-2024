package main.java.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<Pessoa>();
    }
    public void adicionarPessoa(String nome,int idade,double altura) {
       pessoasList.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa> ordenaPorIdade(){
        List <Pessoa> pessoasPorIdade= new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenaPorAltura(){
        List <Pessoa> pessoasPorAltura= new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
       // System.out.println(ordenacaoPessoas.pessoasList);

        // Ordenando e exibindo por idade
       // System.out.println(ordenacaoPessoas.ordenaPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenaPorAltura());
    }
}

