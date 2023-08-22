/*
Faça um programa para ler três notas de um aluno em uma disciplina e
imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
*/

import java.util.Scanner;

public class Uni3Exe04 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int PESO_A = 5, PESO_B = 3, PESO_C = 2;

    System.out.println("Digite a primeira nota com peso 5: ");
    double nota1 = keyboard.nextDouble();
    System.out.println("Digite a primeira nota com peso 3: ");
    double nota2 = keyboard.nextDouble();
    System.out.println("Digite a primeira nota com peso 2: ");
    double nota3 = keyboard.nextDouble();

    double mediaPonderada = ( nota1 * PESO_A + nota2 * PESO_B + nota3 * PESO_C ) / (PESO_A + PESO_B + PESO_C);

    System.out.printf("Media ponderada do aluno: %.2f", mediaPonderada);

    keyboard.close();
  }
}
