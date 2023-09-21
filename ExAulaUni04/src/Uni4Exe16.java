/**
 * Uni4Exe16
 * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que
 * a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a
 * soma das idades do homem mais velho com a mulher mais nova, e o produto das
 * idades do homem mais novo com a mulher mais velha.
 */
import java.util.Scanner;

public class Uni4Exe16 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int ageMan1 = scanner.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int ageMan2 = scanner.nextInt();

        System.out.print("Digite a idade da primeira mulher: ");
        int ageWoman1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int ageWoman2 = scanner.nextInt();

        int olderManAge = Math.max(ageMan1, ageMan2);
        int youngerManAge = Math.min(ageMan1, ageMan2);

        int olderWomanAge = Math.max(ageWoman1, ageWoman2);
        int youngerWomanAge = Math.min(ageWoman1, ageWoman2);

        int sumOfAges = olderManAge + youngerWomanAge;
        int productOfAges = youngerManAge * olderWomanAge;

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + sumOfAges);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + productOfAges);

        scanner.close();
    }
}

