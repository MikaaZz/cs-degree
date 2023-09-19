import java.util.Scanner;

/**
 * Uni4Exe09
 * Dados dois valores inteiros, escreva um algoritmo que informe se eles são
 * múltiplos ou não.
 */
public class Uni4Exe09 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Escreva dois valores inteiros para saber se sao multiplos deles mesmo: ");
  int num01 = keyboard.nextInt(), num02 = keyboard.nextInt();

  if (num01 % num02 == 0 && num02 % num01 == 0) {
   System.out.println("Os dois sao multiplos deles mesmos.");
  } else if (num01 % num02 == 0 || num02 % num01 == 0) {
   System.out.println("Pelo menos um deles e multiplo do outro.");
  } else {
   System.out.println("Nenhum deles e multiplo do outro.");
  }

  keyboard.close();
 }
}
