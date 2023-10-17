import java.util.Scanner;

/**
 * Uni05Exe5
 * Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência
 * de números:
 * 8, 10, 16, 18,32,34,64
 * O valor n deve ser lido e deve ser maior do que 2.
 */
public class Uni05Exe5 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int n, num = 8;

  System.out.println("Insira o valor de n");
  n = scanner.nextInt();

  if (n > 2) {
   for (int i = 1; i <= n; i++) {
    if (num == 8) {
     System.out.println(num);
    }
    System.out.println(num + 2);

    num = num * 2;
    System.out.println(num);
   }
  } else {
   System.out.println("N deve ser maior quw 2");
  }

  scanner.close();
 }
}