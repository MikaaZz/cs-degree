/*
 Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
 */

import java.util.Scanner;

public class Uni3Exe14 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final double CAR_EFFICIENCY = 12.0;

    System.out.println("Digite a distância percorrida (em km):");
    double distance = keyboard.nextDouble();

    System.out.println("Digite o tempo gasto (em horas):");
    double time = keyboard.nextDouble();

    double averageSpeed = distance / time;

    double fuelConsumed = distance / CAR_EFFICIENCY;

    System.out.println("Velocidade média durante a viagem: " + averageSpeed + " km/h");
    System.out.println("Combustível gasto na viagem: " + fuelConsumed + " litros");

    keyboard.close();
  }
}
