/*
 Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50.
 Faça um programa para ler o comprimento e altura de uma parede (em metros),
 e depois escrever o valor gasto com a compra de azulejos.
 Considere que um metro quadrado é formado por 9 azulejos.
 */

import java.util.Scanner;

public class Uni3Exe13 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final double TILE_PRICE = 12.50;
    final int TILES_PER_SQUARE_METER = 9;

    System.out.println("Digite o comprimento da parede (em metros):");
    double wallLength = keyboard.nextDouble();

    System.out.println("Digite a altura da parede (em metros):");
    double wallHeight = keyboard.nextDouble();

    double wallArea = wallLength * wallHeight;

    int totalTilesNeeded = (int) Math.ceil(wallArea * TILES_PER_SQUARE_METER);

    double totalCost = totalTilesNeeded * TILE_PRICE;

    System.out.println("Você precisará de " + totalTilesNeeded + " azulejos.");
    System.out.println("O valor total é: R$" + totalCost);

    keyboard.close();
  }
}
