package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class ConjuntoPalavrasUnicas {
    //atributo

    private Map<String, String> palavrasUnicasMap;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String deifinicao){
        palavrasUnicasMap.put(palavra, deifinicao);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasMap.isEmpty()){
            palavrasUnicasMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasUnicasMap);
    }

    public String pesquisarPorPalavra (String palavra){
        String definicao = palavrasUnicasMap.get(palavra);
        if (definicao != null){
            return definicao;
        }
        return "Linguagem não encontrada no dicinário";
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

       conjuntoPalavrasUnicas.adicionarPalavra("amar", "\n1.\n" +
                "transitivo direto e pronominal\n" +
                "demonstrar amor a.\n" +
                "\"amava-a muito\"\n" +
                "2.\n" +
                "pronominal\n" +
                "ter demasiado amor-próprio.\n");

       conjuntoPalavrasUnicas.adicionarPalavra("odiar", "\n1.\n" +
                "transitivo direto e pronominal\n" +
                "sentir aversão por (algo, alguém, a si próprio ou um ao outro); detestar(-se), abominar(-se).\n" +
                "\"o. ironias\"\n" +
                "2.\n" +
                "transitivo direto\n" +
                "achar muito desprazeroso.\n" +
                "\"o. jiló\"\n");

       conjuntoPalavrasUnicas.adicionarPalavra("desgostar", "\n1.\n" +
                "transitivo indireto e pronominal\n" +
                "não gostar; deixar de sentir simpatia, amor por; desafeiçoar(-se), desestimar(-se).\n" +
                "\"tornou-se incapaz de amar, desgosta dos familiares, dos velhos amigos\"\n" +
                "2.\n" +
                "transitivo direto\n" +
                "dar desgosto, descontentamento, contrariedade a; aborrecer, contrariar, desagradar.\n" +
                "\"não era nossa intenção desgostá-lo, mas sim alegrá-lo\"\n");

       conjuntoPalavrasUnicas.adicionarPalavra("caos", "substantivo masculino" +
                "\n1.\n" +
                "mistura de coisas ou ideias em total desarmonia; confusão.\n" +
                "\"a casa está um c.\"\n" +
                "2.\n" +
                "MITOLOGIA\n" +
                "em diversas tradições mitológicas, vazio primordial de caráter informe, ilimitado e indefinido, que precedeu e propiciou o nascimento de todos os seres e realidades do universo.\n");

        conjuntoPalavrasUnicas.adicionarPalavra("silhueta", "substantivo feminino\n" +
                "1.\n" +
                "desenho que representa o perfil de uma pessoa ou objeto, de acordo com os contornos que a sua sombra projeta.\n" +
                "2.\n" +
                "desenho uniforme formado pela sombra de alguém ou alguma coisa.\n");

        conjuntoPalavrasUnicas.adicionarPalavra("dramaticidade", "substantivo feminino\n" +
                "qualidade do que é dramático.\n");

        conjuntoPalavrasUnicas.exibirPalavras();

        conjuntoPalavrasUnicas.removerPalavra("amar");
        conjuntoPalavrasUnicas.exibirPalavras();

        String denificaoPalavra = conjuntoPalavrasUnicas.pesquisarPorPalavra("silhueta");
        System.out.println("A definição é :" + denificaoPalavra);
    }
}
