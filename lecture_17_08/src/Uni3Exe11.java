/*
  Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
  °F = (9/5) °C + 32
 */

import java.util.Scanner;

public class Uni3Exe11 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Temperatura em graus celsius: ");
    int tempertureInC = keyboard.nextInt();

    double tempertureInF = (tempertureInC * 1.8) + 32;

    System.out.println("Temperatura transformada: " + tempertureInF);

    keyboard.close();
  }
}
