/**
 * Uni4Exe26
 * Dado um caractere indicando uma opção, escreva um algoritmo para:
 *
 * se opção = ‘T’: calcular a área de um triângulo de base b e altura h
 * se opção = ‘Q’: calcular a área de um quadrado de lado l
 * se opção = ‘R’: calcular a área de um retângulo de base b e altura h
 * se opção = ‘C’: calcular a área de um círculo de raio r
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * fluxograma:
 */
import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T - Área de um triângulo");
        System.out.println("Q - Área de um quadrado");
        System.out.println("R - Área de um retângulo");
        System.out.println("C - Área de um círculo");

        char option = scanner.next().charAt(0);

        switch (option) {
            case 'T':
            case 't':
                System.out.println("Digite a base do triângulo:");
                double baseTriangle = scanner.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double heightTriangle = scanner.nextDouble();
                double areaTriangle = (baseTriangle * heightTriangle) / 2;
                System.out.println("Área do triângulo: " + areaTriangle);
                break;

            case 'Q':
            case 'q':
                System.out.println("Digite o lado do quadrado:");
                double side = scanner.nextDouble();
                double areaSquare = side * side;
                System.out.println("Área do quadrado: " + areaSquare);
                break;

            case 'R':
            case 'r':
                System.out.println("Digite a base do retângulo:");
                double baseRectangle = scanner.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double heightRectangle = scanner.nextDouble();
                double areaRectangle = baseRectangle * heightRectangle;
                System.out.println("Área do retângulo: " + areaRectangle);
                break;

            case 'C':
            case 'c':
                System.out.println("Digite o raio do círculo:");
                double radius = scanner.nextDouble();
                double areaCircle = 3.141 * radius * radius;
                System.out.println("Área do círculo: " + areaCircle);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

