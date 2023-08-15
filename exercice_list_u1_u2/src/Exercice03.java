import java.util.Scanner;

public class Exercice03 {
  public static final double PI = 3.14159;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor do raio da circunferência: ");
    double raio = input.nextDouble();
    double area = PI * (raio * raio);

    System.out.printf("A área da circunferência de raio %.2f é: %.4f\n", raio, area);
    input.close();
  }
}
