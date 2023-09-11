import java.util.Scanner;

/**
 * Uni4Exe04
 * Dado um número de ponto flutuante maior do que 0, informe se foram digitadas
 * ou não casas decimais no número.
 */
public class Uni4Exe04 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Informe um numero float: ");
  float number = keyboard.nextFloat();

  if(number % 1 != 0) {
    System.out.println("Tem casas decimais: ");
  } else {
   System.out.println("Nao tem: ");
  }

  keyboard.close();
 }
}
