package exercicios.estruturasControle;
/*
4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
 */

import java.util.Scanner;

public class AntecessorESucessor {
    public int num;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero inteiro: ");
        int num = scanner.nextInt();

        System.out.println("Antecessor: "+ (num-1) + "\nSucessor: " + (num+1));
    }
}
