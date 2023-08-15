import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a Nota A (0.0 a 10.0): ");
    double notaA = sc.nextDouble();

    System.out.print("Digite a Nota B (0.0 a 10.0): ");
    double notaB = sc.nextDouble();

    double pesoA = 3.5;
    double pesoB = 7.5;

    double mediaPonderada = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);

    System.out.printf("Média Ponderada: %.2f%n", mediaPonderada);

    sc.close();
  }
}
