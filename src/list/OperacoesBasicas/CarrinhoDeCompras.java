package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valor, int quantidade){
        Item item = new Item(nome, valor, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();

        if (!itemList.isEmpty()){
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) ;
                {
                    itensRemover.add(i);
                }
            } itemList.removeAll(itensRemover);
        }
        else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getValor() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("cadeira", 200, 3);

        System.out.println("O valor total dos itens é: " + carrinhoDeCompras.calcularValorTotal());


        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("cadeira");

        carrinhoDeCompras.exibirItens();

    }
}
