package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover =a;
                }
            }
            alunoSet.remove( alunoParaRemover );
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

    public void exibirAlunosPorNome() {
        if (alunoSet.isEmpty()) {
            System.out.println("O conjunto está vazio!");

        } else {
            Set<Aluno> alunos = new TreeSet<>(alunoSet);
            System.out.println(alunos);
        }
    }

    public void exibirAlunosPorNota() {
        if (alunoSet.isEmpty()) {
            System.out.println("O conjunto está vazio!");

        } else {
            Set<Aluno> alunos = new TreeSet<>(new ComparatorNota());
            System.out.println(alunos);
        }
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }


}
