import java.util.Scanner;

/**
 * Uni4Exe06
 * Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
 * escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for
 * informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva
 * “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para
 * maiúscula.
 */
public class Uni4Exe06 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  final char MEN = 'M', WOMMAN = 'F', OTHER = 'I';

  System.out.println("Masculino = M, Feminino = F, Nao informar = I");
  char letter = Character.toUpperCase(keyboard.next().charAt(0));

  if (letter == MEN) {
   System.out.println("Masculino");
  } else if (letter == WOMMAN) {
   System.out.println("Feminino");
  } else if (letter == OTHER) {
   System.out.println("Nao informado");
  } else {
   System.out.println("Entrada incorreta");
  }
  keyboard.close();
 }
}
