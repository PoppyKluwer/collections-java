package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
       this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
            if (palavrasSet.contains(palavra)) {
                palavrasSet.remove(palavra);
            }
    }

    public boolean verificarPalavra (String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas () {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Dalva");
        conjuntoPalavrasUnicas.adicionarPalavra("Carlinhos");
        conjuntoPalavrasUnicas.adicionarPalavra("Cleide");
        conjuntoPalavrasUnicas.adicionarPalavra("Cavalos");
        conjuntoPalavrasUnicas.adicionarPalavra("Cavalos");

        System.out.println("A palavra 'Carlinhos' está no conjunto ? " + conjuntoPalavrasUnicas.verificarPalavra("Carlinhos") );

        conjuntoPalavrasUnicas.removerPalavra("Carlinhos");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


        System.out.println("A palavra 'Carlinhos' está no conjunto ? " + conjuntoPalavrasUnicas.verificarPalavra("Carlinhos") );


        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
