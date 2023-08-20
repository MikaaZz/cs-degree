/*
Um restaurante cobra R$ 25,00 por cada quilo de refeição.
Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
O peso do prato é de 750 gramas.

Entradas:
Peso do prato com comida

Processo:
Peso do prato - 750g  * 25

Saida:
Valor a pagar

 */

import java.util.Scanner;

public class Uni3Exe06 {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    final double VALUE_PER_KG = 25.00, PLATE_WEIGHT = 0.750;

    System.out.println("Valor do prato em KG's: ");
    double weight = keyboard.nextDouble();
    double finalPrice = (weight - PLATE_WEIGHT) * VALUE_PER_KG;

    System.out.println("Valor a ser pago: R$" + finalPrice);

    keyboard.close();
  }
}
