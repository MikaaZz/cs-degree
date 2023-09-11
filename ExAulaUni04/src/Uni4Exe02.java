import java.util.Scanner;

/**
 * Uni4Exe02
 * Uni4Exe02.java
 *
 * Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * 
 */
public class Uni4Exe02 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Entre com o valor inteiro maior que 0;");
  int number = keyboard.nextInt();

  if (number % 2 == 0) {
   System.out.println("Numero par");
  } else {
   System.out.println("Numero impar");
  };

  keyboard.close();
 }
}
