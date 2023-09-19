import java.util.Scanner;

/**
 * Uni4Exe08
 * Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * fluxograma:
 */
public class Uni4Exe08 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Informe a letra: ");
  char letter = keyboard.next().charAt(0);
  if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
   System.out.println("Vogal");
  } else {
   System.out.println("Nao vogal");
  }

  keyboard.close();
 }
}
