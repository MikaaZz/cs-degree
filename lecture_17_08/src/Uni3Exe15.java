/*
 Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
 X centena(s)  Y dezena(s) K unidade(s)
 Exemplo, se for submetido o número 384, o programa deverá exibir:
 3 centena(s)  8 dezena(s) 4 unidade(s)
 */

import java.util.Scanner;

public class Uni3Exe15 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Digite um número inteiro (até 3 dígitos):");
    int number = keyboard.nextInt();

    int hundreds = number / 100;
    int tens = (number % 100) / 10;
    int units = number % 10;

    System.out.println(hundreds + " centena(s) " + tens + " dezena(s) " + units + " unidade(s)");

    keyboard.close();
  }
}
