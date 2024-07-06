package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    public SomaNumeros() {
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
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(9);

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontarMaiorNumero());
        System.out.println(somaNumeros.encontarMenorNumero());

        somaNumeros.exibirNumero();
    }
}
