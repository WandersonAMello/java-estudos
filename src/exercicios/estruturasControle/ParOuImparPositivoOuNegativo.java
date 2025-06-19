package exercicios.estruturasControle;
//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class ParOuImparPositivoOuNegativo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero qualquer: ");
        double num = scanner.nextDouble();

        System.out.println((num%2)!=0 ? "Impar" : "Par");
        System.out.println(num<0 ? "Negativo" : "Positivo");

    }
}
