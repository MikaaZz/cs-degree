// Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.

import java.util.Scanner;

public class Uni3Exe10 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Informe o comprimento do primeiro cateto:");
    double cateto1 = keyboard.nextDouble();

    System.out.println("Informe o comprimento do segundo cateto:");
    double cateto2 = keyboard.nextDouble();

    double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

    System.out.println("Comprimento da hipotenusa: " + hipotenusa);

    keyboard.close();
  }
}
