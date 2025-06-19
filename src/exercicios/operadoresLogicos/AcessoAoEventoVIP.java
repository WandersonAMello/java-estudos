package exercicios.operadoresLogicos;
/*
Exercício: Acesso ao Evento VIP
Um sistema de acesso a um evento VIP precisa verificar se a pessoa pode entrar. As regras de entrada são as seguintes:

A idade mínima para entrar no evento é 18 anos.

Pessoas com idade entre 16 e 17 anos só podem entrar se estiverem acompanhadas de um responsável.

Pessoas com menos de 16 anos não podem entrar, mesmo acompanhadas.

✅ Requisitos:
Peça ao usuário que informe:

Sua idade (int)

Se está acompanhado de um responsável (boolean)

Imprima uma das seguintes mensagens:

"Entrada permitida." — se a pessoa tiver 18 anos ou mais, ou tiver 16 ou 17 e estiver acompanhada

"Entrada negada. Acompanhamento necessário." — se tiver 16 ou 17 e não estiver acompanhada

"Entrada negada. Idade insuficiente." — se tiver menos de 16 anos
 */
import java.util.Scanner;
public class AcessoAoEventoVIP {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade;
        boolean isAcompanhadoPorResponsavel;

        System.out.println("Portaria: para entrar no evento é necessário responder essas perguntas");
        System.out.print("Informe sua idade: ");
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Entrada negada. Idade insuficiente.");
        } else if (idade >= 18) {
            System.out.println("Entrada permitida.");
        } else {
            System.out.print("Está acompanhado por um responsável? (true/false): ");
            isAcompanhadoPorResponsavel = scanner.nextBoolean();

            if (isAcompanhadoPorResponsavel) {
                System.out.println("Entrada permitida.");
            } else {
                System.out.println("Entrada negada. Acompanhamento necessário.");
            }
        }

        scanner.close();
    }
}
