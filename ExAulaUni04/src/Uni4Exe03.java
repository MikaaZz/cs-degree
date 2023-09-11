import java.util.Scanner;

/**
 * Uni4Exe03
 * Dados dois números inteiros descreva um algoritmo para informar o maior valor
 * entre eles.
 */
public class Uni4Exe03 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Insira dois valores para ver qual tem o maior valor: ");
  int numberOne = keyboard.nextInt(), numberTwo = keyboard.nextInt();

  if (numberOne > numberTwo) {
   System.out.println("Numero 01 tem maior valor: ");
  } else if (numberOne == numberTwo) {
   System.out.println("Numero 01 e 02 tem o mesmo valor: ");
  } else {
   System.out.println("Numero 02 tem maior valor: ");
  }
  System.out.println("Numero 01: " + numberOne + ", Numero 02: " + numberTwo);

  keyboard.close();
 }
}
