import java.util.Scanner;

/**
 * Uni05Exe1\
 * Descreva um algoritmo que leia 20 números inteiros e escreva, para cada
 * número lido, se o mesmo é par ou ímpar.
 */
public class Uni05Exe1 {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  final int MAX_NUM_OF_REPS = 20;
  int num;

  for (int i = 1; i <= MAX_NUM_OF_REPS; i++) {
   System.out.println("Insira seu numero");
   num = scanner.nextInt();
   if (num % 2 == 0) {
    System.out.println("Numero: " + num + " considerado par");
   } else {
    System.out.println("Numero: " + num + "considerado impar");
   }
  }
  System.out.println("Voce completou o loop!");

  scanner.close();
 }
}