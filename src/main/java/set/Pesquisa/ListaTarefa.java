package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
   private Set<Tarefa> tarefaSet;

   public ListaTarefa() {
       tarefaSet = new HashSet<Tarefa>();
   }
   public void adicionarTarefa(String descricao) {
       tarefaSet.add(new Tarefa(descricao));
   }
   public void removerTarefa (String descricao){
       Tarefa tarefaParaRemover=null ;
       if(!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover =tarefa;
                    break;
                }
            }
           tarefaSet.remove(tarefaParaRemover);
       }
       else
           System.out.println("Conjunto esta vazio");

       if(tarefaParaRemover == null)
           System.out.println("Tarefa nao encontrada");
   }

   public void exibirTarefas(){
       if(tarefaSet.isEmpty()){
           System.out.println("Tarefa nao existe");
       }
       else
           System.out.println(tarefaSet);
   }
   public int contarTarefas(){
       return tarefaSet.size();
   }
   public Set<Tarefa>obterTarefasConcluidas(){
       Set<Tarefa> tarefaconcluida=new HashSet<>();
       for (Tarefa tarefa : tarefaSet) {
           if (tarefa.isConcluida()){
               tarefaconcluida.add(tarefa);
           }
       }
       return tarefaconcluida;

   }
    public Set<Tarefa>obterTarefasPendentes(){
        Set<Tarefa> tarefaPendente=new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConcluida()){
                tarefaPendente.add(tarefa);
            }
        }
        return tarefaPendente;

    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(true);
            }
        }
   }
   public void marcarTarefaPendente(String descricao){
       for (Tarefa tarefa : tarefaSet) {
           if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
               tarefa.setConcluida(false);
           }
       }
   }
   public void limparListaTarefas(){
       if(tarefaSet.isEmpty()){
           System.out.println("Lista vazia");
       }
       else
           tarefaSet.clear();
   }
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefa listaTarefas = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}


