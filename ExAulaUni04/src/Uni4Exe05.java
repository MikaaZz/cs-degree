import java.util.Scanner;

/**
 * Uni4Exe05
 * Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável
 * lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”,
 * caso seja false.
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * 
 */
public class Uni4Exe05 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Cor azul? Responda com true ou false");
  
  boolean isBlue = keyboard.nextBoolean();

  if (isBlue) {
   System.out.println("Sim, cor azul");
  } else {
   System.out.println("Nao azul");
  }

  keyboard.close();
 }
}
