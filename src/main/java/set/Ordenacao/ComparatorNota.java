package main.java.set.Ordenacao;

import java.util.Comparator;

public class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno n1, Aluno n2) {
        return Double.compare(n1.getNota(), n2.getNota());
    }
}
