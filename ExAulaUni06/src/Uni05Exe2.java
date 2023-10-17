/**
 * Uni05Exe2
 * Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma
 * dos números ímpares entre 1 e 100.
 */
public class Uni05Exe2 {
 public static void main(String[] args) {
  final int MIN_NUM = 1, MAX_NUM = 100;
  int sumPair = 0, sumOdd = 0;

  for (int i = MIN_NUM; i <= MAX_NUM; i++) {
   if (i % 2 == 0) {
    sumPair = sumPair + i;
   } else {
    sumOdd = sumOdd + i;
   }
  }
  System.out.println("Soma de numeros Pares: " + sumPair);
  System.out.println("Soma de numeros Impares: " + sumOdd);
 }

}