package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    public void addConvidado(String nome,int codigo) {
        convidadosSet.add(new Convidado(nome,codigo));
    }
    public void removerConvidadoPorcodigoConvite(int codigoConvite) {
        Convidado convidadopararemover =null;

        for (Convidado c: convidadosSet) {
            if (c.getCodigoConvite()==codigoConvite) {
                convidadopararemover = c;
                break;
            }

        }
        convidadosSet.remove(convidadopararemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Exibindo o número de convidados no conjunto (deve ser zero)
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Adicionando convidados ao conjunto
        conjuntoConvidados.addConvidado("Alice", 1234);
        conjuntoConvidados.addConvidado("Bob", 1235);
        conjuntoConvidados.addConvidado("Charlie", 1235);
        conjuntoConvidados.addConvidado("David", 1236);

        // Exibindo os convidados no conjunto
       // System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoPorcodigoConvite(1236);
       // System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        // Exibindo os convidados atualizados no conjunto
       // System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}
