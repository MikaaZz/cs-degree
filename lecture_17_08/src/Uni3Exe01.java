import java.util.Scanner;

/*
  Entrada:
  Ler altura
  Ler largura

  Processos:
  Calcular a area

  Saida:
  Valor da area
 */

public class Uni3Exe01 {
  public static void main(String[] args) throws Exception {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Digite o valor da altura em metros: ");
      int length = keyboard.nextInt();
      System.out.print("Digite o valor da largura em metros: ");
      int width = keyboard.nextInt();

      int area = length * width;
      System.out.print("Area do seu terreno: " + area + ".");

      keyboard.close();
    }
}
