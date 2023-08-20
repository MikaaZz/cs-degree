/*

No pé direito do frango há um anel com um chip de identificação;
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50,
faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

Entrada:
Quantidade de frangos

Processo:
Valor de cada anel * quantidade de frangos

Saida:
Valor gasto para todos os frangos

 */

import java.util.Scanner;

public class Uni3Exe05 {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    final double RINGS_VALUE = 4.00 + 3.50;

    System.out.println("Insira a quantidade de frangos no seu galinheiro: ");
    int chickenQuantity = keyboard.nextInt();
    double finalValue = RINGS_VALUE * chickenQuantity;

    System.out.println("Valor total gasto: R$" + finalValue);

    keyboard.close();
  }
}
