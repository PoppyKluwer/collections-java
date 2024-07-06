package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class OdernacaoNumeros {

    List<Integer> numeros;

    public OdernacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for (Integer numero : numeros){
            if (numero >= maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero : numeros){
            if (numero <= menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumero(){
        System.out.println(this.numeros);
    }

    public static void main(String[] args) {
        OdernacaoNumeros odernacaoNumeros = new OdernacaoNumeros();

        odernacaoNumeros.adicionarNumero(4);
        odernacaoNumeros.adicionarNumero(5);
        odernacaoNumeros.adicionarNumero(6);
        odernacaoNumeros.adicionarNumero(7);
        odernacaoNumeros.adicionarNumero(8);
        odernacaoNumeros.adicionarNumero(9);

        System.out.println(odernacaoNumeros.calcularSoma());

        System.out.println(odernacaoNumeros.encontarMaiorNumero());
        System.out.println(odernacaoNumeros.encontarMenorNumero());

        odernacaoNumeros.exibirNumero();
    }
}
