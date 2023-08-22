/*
 Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
 Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco.
 Suponha que o sistema monetário não utilize centavos.
 */

import java.util.Scanner;

public class Uni3Exe16 {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Informe o valor do troco (em reais):");
    int troco = keyboard.nextInt();

    int notas100 = troco / 100;
    int resto = troco % 100;

    int notas10 = resto / 10;
    resto = resto % 10;

    int notas1 = resto;

    System.out.println("Notas de R$100: " + notas100);
    System.out.println("Notas de R$10: " + notas10);
    System.out.println("Notas de R$1: " + notas1);

    keyboard.close();
  }
}
