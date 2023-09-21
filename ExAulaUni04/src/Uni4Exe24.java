/**
 * Uni4Exe24
 * Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem
 * a partir de um menu de opções:
 *
 * se opção = 1, escreva os 3 valores em ordem crescente
 * se opção = 2, escreva os 3 valores em ordem decrescente
 * se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
 *
 */
import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int value1 = scanner.nextInt();

        System.out.println("Enter the second value:");
        int value2 = scanner.nextInt();

        System.out.println("Enter the third value:");
        int value3 = scanner.nextInt();

        System.out.println("Choose an option:\n1 - Ascending order\n2 - Descending order\n3 - Largest value in the middle");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                if (value1 <= value2 && value1 <= value3) {
                    System.out.print(value1 + " ");
                    if (value2 <= value3) {
                        System.out.println(value2 + " " + value3);
                    } else {
                        System.out.println(value3 + " " + value2);
                    }
                } else if (value2 <= value1 && value2 <= value3) {
                    System.out.print(value2 + " ");
                    if (value1 <= value3) {
                        System.out.println(value1 + " " + value3);
                    } else {
                        System.out.println(value3 + " " + value1);
                    }
                } else {
                    System.out.print(value3 + " ");
                    if (value1 <= value2) {
                        System.out.println(value1 + " " + value2);
                    } else {
                        System.out.println(value2 + " " + value1);
                    }
                }
                break;

            case 2:
                if (value1 >= value2 && value1 >= value3) {
                    System.out.print(value1 + " ");
                    if (value2 >= value3) {
                        System.out.println(value2 + " " + value3);
                    } else {
                        System.out.println(value3 + " " + value2);
                    }
                } else if (value2 >= value1 && value2 >= value3) {
                    System.out.print(value2 + " ");
                    if (value1 >= value3) {
                        System.out.println(value1 + " " + value3);
                    } else {
                        System.out.println(value3 + " " + value1);
                    }
                } else {
                    System.out.print(value3 + " ");
                    if (value1 >= value2) {
                        System.out.println(value1 + " " + value2);
                    } else {
                        System.out.println(value2 + " " + value1);
                    }
                }
                break;

            case 3:
                if ((value1 >= value2 && value1 <= value3) || (value1 <= value2 && value1 >= value3)) {
                    System.out.println(value2 + " " + value1 + " " + value3);
                } else if ((value2 >= value1 && value2 <= value3) || (value2 <= value1 && value2 >= value3)) {
                    System.out.println(value1 + " " + value2 + " " + value3);
                } else {
                    System.out.println(value1 + " " + value3 + " " + value2);
                }
                break;

            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}

