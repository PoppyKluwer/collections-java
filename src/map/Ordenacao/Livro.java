package map.Ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    //atributos

    private String título;
    private String autor;
    private double preco;

    public Livro(String título, String autor, double preco) {
        this.título = título;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
    class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>>{
        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
        }
    }

    class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>>{
        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
        }
    }

