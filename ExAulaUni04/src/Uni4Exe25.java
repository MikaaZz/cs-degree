/**
 * Uni4Exe25
 * Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e
 * execute a operação correspondente. O algoritmo deve exibir uma mensagem de
 * erro se a opção for inválida. O menu tem as seguintes opções:
 * Escolha uma opção:
 * 1 - Soma de dois números.
 * 2 - Diferença entre dois números.
 * 3 - Produto entre dois números.
 * 4 - Divisão entre dois números (o denominador não pode ser zero).
 */
import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números.");

        int option = scanner.nextInt();

        System.out.println("Digite o primeiro número:");
        double number1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double number2 = scanner.nextDouble();

        switch (option) {
            case 1:
                System.out.println("Soma: " + (number1 + number2));
                break;

            case 2:
                System.out.println("Diferença: " + (number1 - number2));
                break;

            case 3:
                System.out.println("Produto: " + (number1 * number2));
                break;

            case 4:
                if (number2 == 0) {
                    System.out.println("Erro: o denominador não pode ser zero.");
                } else {
                    System.out.println("Divisão: " + (number1 / number2));
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

