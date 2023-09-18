import java.util.Scanner;

/**
 * Uni4Exe07
 * O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com
 * peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em
 * que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em
 * gramas, determine o custo do selo.
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * fluxograma:
 */
public class Uni4Exe07 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Entre com o peso da carta. ( Em gramas )");
  float weight = keyboard.nextFloat(), payedValue = 0.0f;

  if (weight > 50) {
   float extraWeight = weight - 50;
   float extraQuantity = (extraWeight / 20) + 1;
   payedValue = 0.45f + 0.45f * extraQuantity;
  } else {
   payedValue = 0.45f;
  }
  System.out.println("Custo do selo: " + payedValue);
  keyboard.close();
 }
}
