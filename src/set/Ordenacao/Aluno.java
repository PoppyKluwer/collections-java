package set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{

    private String nome;

    private double media;

    private long matricula;

    public Aluno(String nome, double media, long matricula) {
        this.nome = nome;
        this.media = media;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", media=" + media +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno p1, Aluno p2) {
        return Double.compare(p1.getMedia(), p2.getMedia());
    }
}
