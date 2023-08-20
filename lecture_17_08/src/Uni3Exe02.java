/*

Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx

Entrada
Preco do sapato
Desconto de 12%

Processo
Calcular o valor do desconto e o valor do produto

Saida
Valor do desconto e valor do produto com desconto
 */

import java.util.Scanner;

public class Uni3Exe02 {
  public static void main(String[] args) {
    final int DISCOUNT = 12;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Digite o valor do sapato: ");
    double productValue = keyboard.nextDouble();

    double discountValue = productValue / DISCOUNT;
    double productValueWithDiscount = productValue - discountValue;

    System.out.println("O valor do desconto \u00E9 de R$" + discountValue);
    System.out.println("O pre\u00E7o do par de sapatos com desconto \u00E9 R$" + productValueWithDiscount);

    keyboard.close();
  }
}
