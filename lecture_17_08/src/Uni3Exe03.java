/*
  Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.

  Entrada
  Preco do litro
  Valor do pagamento

  Processo
  Calcular o valor de litros abastecidos
  Valor do pagamento / litro

  Saida
  Quantos litros colocou

 */

import java.util.Scanner;

public class Uni3Exe03 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Digite o valor da gasolina: ");
    double gasValue = keyboard.nextDouble();
    System.out.println("Insira o valor que quer colocar no seu tanque: ");
    double clientValue = keyboard.nextDouble();

    double gasQuantity = clientValue / gasValue;

    System.out.println("Quantidade de litros: " + gasQuantity);

    keyboard.close();
  }
}
