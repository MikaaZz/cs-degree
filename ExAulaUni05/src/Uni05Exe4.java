/**
 * Uni05Exe4
 * Descreva um algoritmo para calcular o valor de S dado por:
 * 
 * S = 2 /3 + 5 / 6 + 7 / 12 + 9 / 20 + 11 / 30 ...
 * 
 * Considere os 20 primeiros termos da série.
 */
public class Uni05Exe4 {
 public static void main(String[] args) {

  double sum = 0;
  int numerator = 2, denominator = 3;
  final int MAX_NUM_OF_REPS = 20;

  for (int i = 1; i <= MAX_NUM_OF_REPS; i++) {
   sum = sum + (double) numerator / denominator;
   numerator = numerator + 2;
   denominator = denominator + 3;
  }
  System.out.println("Soma: " + sum);

 }

}