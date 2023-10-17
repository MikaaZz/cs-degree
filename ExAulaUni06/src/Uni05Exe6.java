import java.util.Scanner;

/**
 * Uni05Exe6
 * Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de
 * altura das mesmas.
 */
public class Uni05Exe6 {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  final int MAX_NUM_OF_REPS = 20;
  double sumOfHeights = 0, averageOfHeights;

  for (int i = 1; i < MAX_NUM_OF_REPS; i++) {
   System.out.println("Entre com a altura da pessoa: " + i);
   double height = scanner.nextDouble();
   System.out.println("Altura da pessoa " + i + ": " + height);
   sumOfHeights = sumOfHeights + height;
  }
  averageOfHeights = sumOfHeights / MAX_NUM_OF_REPS;
  System.out.println("Media de altura: " + averageOfHeights);

  scanner.close();
 }
}