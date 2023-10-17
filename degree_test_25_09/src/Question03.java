import java.util.Scanner;

public class Question03 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Digite o tipo que voce precisa: V | A | B.");
  char paintType = Character.toUpperCase(keyboard.next().charAt(0));

  if (paintType == 'V') {
   System.out.println("Tipo: " + paintType);
   System.out.println("Caracteristica: " + "Verde");
  } else if (paintType == 'A') {
   System.out.println("Tipo: " + paintType);
   System.out.println("Caracteristica: " + "Azul");
  } else if (paintType == 'B') {
   System.out.println("Tipo: " + paintType);
   System.out.println("Caracteristica: " + "Branca");
  } else {
   System.out.println("Tipo incorreto!");
  }

  keyboard.close();
 }
}
