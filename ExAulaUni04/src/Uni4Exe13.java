import java.util.Scanner;

/**
 * Uni4Exe13
 * Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as
 * três cartas deste usuário em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3;
 * 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a
 * palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" (se
 * APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas
 * forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso
 * nada.
 * Dica: criar variáveis intermediárias para contar a quantidade de "boas".
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * fluxograma:
 */
public class Uni4Exe13 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Informe as 3 cartas: ");
  int letterOne = keyboard.nextInt(), letterTwo = keyboard.nextInt(), letterThree = keyboard.nextInt(),
    numOfGodLetters = 0;

  if (letterOne == 1 || letterTwo == 2 || letterThree == 3) {
   numOfGodLetters++;
  }
  if (letterTwo == 1 || letterTwo == 2 || letterTwo == 3) {
   numOfGodLetters++;
  }
  if (letterThree == 1 || letterThree == 2 || letterThree == 3) {
   numOfGodLetters++;
  }
  if (numOfGodLetters == 1) {
   System.out.println("Truco");
  } else if (numOfGodLetters == 2) {
   System.out.println("Seis");
  } else if (numOfGodLetters == 3) {
   System.out.println("Nove");
  }

  keyboard.close();
 }
}
