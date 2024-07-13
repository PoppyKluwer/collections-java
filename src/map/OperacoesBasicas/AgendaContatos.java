package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()){
            numeroPorNome =agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Dalva", 123456);
        agendaContatos.adicionarContato("Dalva", 5665);
        agendaContatos.adicionarContato("Cleide", 1111111);
        agendaContatos.adicionarContato("Cleide sem calcinha", 654987 );
        agendaContatos.adicionarContato("Carlinhos", 1111111);
        agendaContatos.adicionarContato("Dalva", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Carlinhos");
        agendaContatos.exibirContatos();

        System.out.println("O numero é " + agendaContatos.pesquisarPorNome("Cleide sem calcinha"));
    }
}
