package exercicios.estruturasControle;
/*
3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,

caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e

imprimir seu valor na tela.
 */

import java.util.Scanner;
public class SomaOuMultiplicaAEB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira dois valores inteiros A e B:");
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        int c = valorA==valorB ? valorA+valorB : valorA*valorB;

        System.out.println("Resultado: "+ c);

    }
}

