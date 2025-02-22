package list.OperacoesBasicas;

public class Item {

    private String nome;
    private double valor;
    private int quantidade;

    public Item(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{ " +
                 quantidade + "x " +
                nome + '\'' +
                  valor+ " " + "reais" +
                " }";
    }
}
