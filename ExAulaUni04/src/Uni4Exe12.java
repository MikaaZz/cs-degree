import java.util.Scanner;

/**
 * Uni4Exe12
 * Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos
 * lados de um triângulo, descreva um algoritmo que verifique se os mesmos podem
 * ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique
 * e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo
 * escaleno". Em caso negativo, informe que os mesmos não formam um triângulo.
 * Considere que:
 *
 * o comprimento de cada lado de um triângulo é menor que a soma dos
 * comprimentos dos outros lados
 * um triângulo equilátero tem três lados iguais
 * um triângulo isóscele tem dois lados iguais e um diferente
 * um triângulo escaleno tem três lados diferentes
 *
 * Se tiveres dúvidas em pensar que quais três lados (segmentos reta) sempre
 * formam um triângulo olhe este PDF: Uni4Exe12_duvida
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * fluxograma:
 */
public class Uni4Exe12 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Entre com o comprimento do lado1: ");
  double side1 = keyboard.nextDouble();
  System.out.println("Entre com o comprimento do lado2: ");
  double side2 = keyboard.nextDouble();
  System.out.println("Entre com o comprimento do lado3: ");
  double side3 = keyboard.nextDouble();

  if (side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side1 + side2)) {
   if (side1 == side2 && side1 == side3) {
    if (side1 == side2 || side2 == side3 || side1 == side3) {
     System.out.println("Isosceles");
    } else {
     System.out.println("Escaleno");
    }
   } else {
    System.out.println("Equilatero");
   }
  } else {
   System.out.println("Nao forma um triangulo.");
  }

  keyboard.close();
 }
}
