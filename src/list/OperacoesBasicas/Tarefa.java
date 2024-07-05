package list.OperacoesBasicas;

public class Tarefa {
    //atribute
    private String descricao;

    public Tarefa(java.lang.String descricao) {
        this.descricao = descricao;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
