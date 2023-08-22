/*
Descreva um programa que calcule o volume de uma lata de óleo.
Fórmula: PI * raio2 * altura;

Quantas casas decimais devo usar para o número Pi?
3.1415

*/

import java.util.Scanner;

public class Uni3Exe09 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final double PI = 3.1415;

    System.out.println("Insira o raio da lata: ");
    double raio = keyboard.nextDouble();

    System.out.println("Agora, digite a altura da lata: ");
    double altura = keyboard.nextDouble();

    double volume = (PI * (raio * raio)) * altura;
    System.out.println("Volume da sua lata: " + volume);

    keyboard.close();
  }
}
