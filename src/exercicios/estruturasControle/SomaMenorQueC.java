package exercicios.estruturasControle;


import java.util.Scanner;

public class SomaMenorQueC {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor A:");
        float a = scanner.nextFloat();

        System.out.println("Insira o valor B:");
        float b = scanner.nextFloat();

        System.out.println("Insira o valor C:");
        float c = scanner.nextFloat();

        float soma = a+b;
        System.out.println("A + B: "+soma);
        System.out.println( soma<c ? "C é maior que a soma de A+B" : "A soma de A+B não é maior que C");

    }
}
