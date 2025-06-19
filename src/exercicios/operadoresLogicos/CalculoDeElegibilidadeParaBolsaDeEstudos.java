package exercicios.operadoresLogicos;
/*
Exercício: Cálculo de Elegibilidade para Bolsa de Estudos
Uma universidade está avaliando candidatos para uma bolsa de estudos. Os critérios para concessão da bolsa são:

O candidato deve ter uma média igual ou superior a 7.0;

E frequência igual ou superior a 75%;

Ou ser de baixa renda e ter pelo menos média 6.0.

Requisitos:
Peça ao usuário para informar:

Sua média final (double)

Sua frequência em porcentagem (int)

Se é de baixa renda (boolean)

Exiba:

"Aprovado para bolsa" ou

"Não atende aos critérios da bolsa"
 */
import java.util.Scanner;
public class CalculoDeElegibilidadeParaBolsaDeEstudos {
    public static void main(String[] args){
        double mediaFinal;
        int frequenciaPorcentagem;
        boolean isBaixaRenda;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para saber se está elegivel para a bolsa de estudos, informe:");
        System.out.println("Sua média final:");
        mediaFinal = scanner.nextDouble();
        System.out.println("Frequencia em porcentagem: 0 a 100%");
        frequenciaPorcentagem = scanner.nextInt();
        System.out.println("É baixa renda? true/false");
        isBaixaRenda = scanner.nextBoolean();

        boolean elegivel = (isBaixaRenda && frequenciaPorcentagem>75) || (!isBaixaRenda && frequenciaPorcentagem>75);
        System.out.println(elegivel ? "Aprovado para bolsa" : "Não atende aos critérios da bolsa");

        scanner.close();
    }
}
