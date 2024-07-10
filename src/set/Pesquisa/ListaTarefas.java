package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // atribute

    HashSet<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefasParaRemover = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao() == descricao){
               tarefasParaRemover = t;
            }
        }
        tarefaSet.remove(tarefasParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("Existem " + tarefaSet.size() + " tarefas dentro do Set" );
    }

    public Set<Tarefa> obterTarefasConcluida(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefasPendente(String descricao){
        Tarefa tarefasPendentes = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPendentes = t;
                break;
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Dar a bunda para 2050 homens diferentes");
        listaTarefas.adicionarTarefa("Dar a bunda para 2050 homens diferentes");
        listaTarefas.adicionarTarefa("Devolver a calcinha da cleide");
        listaTarefas.adicionarTarefa("Salvar a vagabunda da Dalva");
        listaTarefas.adicionarTarefa("Chupar cavalos");
        listaTarefas.adicionarTarefa("Enfiar garrafa no cu");

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        System.out.println(listaTarefas.obterTarefasConcluida());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Chupar cavalos");
        System.out.println(listaTarefas.obterTarefasConcluida());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Enfiar garrafa no cu");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
