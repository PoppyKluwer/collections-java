package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    // atribute

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        }
    }

    public int exibirContagemPalavra(){
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraFrequente = null;
        int maiorContagem = 0;
        if (!contagemPalavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraFrequente = entry.getKey();
                }
            }
        }
        return palavraFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavra() + " palavras.");

        String linguagemMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}




