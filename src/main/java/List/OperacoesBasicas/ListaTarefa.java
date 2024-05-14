package main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaspararemover =new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaspararemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefaspararemover);
    }
    public int obterNumrototalDeTarefas(){
        return tarefaList.size();
    }
    public void imprimirListaTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa= new ListaTarefa();
        System.out.println("Numero total de elementos na lista é "+listaTarefa.obterNumrototalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Numero total de elementos na lista é "+listaTarefa.obterNumrototalDeTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Numero total de elementos na lista é "+listaTarefa.obterNumrototalDeTarefas());

        listaTarefa.imprimirListaTarefa();
    }
}

