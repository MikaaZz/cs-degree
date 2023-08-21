/*
  Uma fábrica de refrigerantes vende seu produto em três formatos:
  lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
  Se um comerciante compra uma determinada quantidade de cada formato,
  faça um programa para calcular quantos litros de refrigerante ele comprou.

  Entrada
  Quantidade de cada formato

  Processos
  Multiplicar quantidade por volume de cada tipo e somar tudo

  Saida
  Litros de refrigerante

*/

import java.util.Scanner;

public class Uni3Exe07 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final double ML_LATA = .350, ML_GARRAFA = .600, ML_LITRAO = 2.0;
    int amountOfLata = 0, amountOfGarrafa600 = 0, amountOfGarrafa2Litros = 0;
    boolean isChoosen = true;

    System.out.println("Qual tipo de refrigerante voce quer comprar?");
    while (isChoosen) {
      System.out.println("1 - Lata | 2 - Garrafa 600 | 3 - Garrafa 2 litros");
      int userChoice = keyboard.nextInt();
      System.out.println("Digite a quantidade: ");
      if (userChoice == 1) {
        amountOfLata += keyboard.nextInt();
      } else if (userChoice == 2) {
        amountOfGarrafa600 += keyboard.nextInt();
      } else if (userChoice == 3) {
        amountOfGarrafa2Litros += keyboard.nextInt();
      }
      System.out.println("Voce quer mais algum produto? (y = sim, n = nao)");
      char choice = keyboard.next().charAt(0);
      isChoosen = (choice == 'y');
    }

    double total = (amountOfLata * ML_LATA) + (amountOfGarrafa600 * ML_GARRAFA) + (amountOfGarrafa2Litros * ML_LITRAO);
    System.out.println("Total de Litros: " + total + "L.");

    keyboard.close();
  }
}
