package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // atribute

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno (String nome, double media, long matricula){
        alunoSet.add(new Aluno(nome, media, matricula));
    }

    public void removerAluno (long matricula){
        Aluno alunosParaRemover = null;
        for (Aluno a : alunoSet){
            if (a.getMatricula() == matricula){
                alunosParaRemover = a;
            }
        }
        alunoSet.remove(alunosParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        alunoSet.addAll(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.adicionarAluno("Dalva", 6, 346457);
        gerenciadorAlunos.adicionarAluno("Cleide", 9, 346778);
        gerenciadorAlunos.adicionarAluno("Carlinhos", 10, 464575);
        gerenciadorAlunos.adicionarAluno("Cavalo", 2, 467890);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(346778);
        gerenciadorAlunos.exibirAlunos();
    }
}
