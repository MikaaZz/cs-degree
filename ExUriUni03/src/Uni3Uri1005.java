import java.util.Scanner;

/**
 * Uni3Uri1005
 *
 *
 * Read four integer values named A, B, C and D. Calculate and print the
 * difference of product A and B by the product of C and D (A * B - C * D).
 * Input
 * The input file contains 4 integer values.
 *
 * Output
 * Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters,
 * according to the following example, with a blank space before and after the
 * equal signal.
 *
 */
public class Uni3Uri1005 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int A = keyboard.nextInt();
    int B = keyboard.nextInt();
    int C = keyboard.nextInt();
    int D = keyboard.nextInt();

    int DIFERENCA = (A * B) - (C * D);

    System.out.println("DIFERENCA = " + DIFERENCA);

    keyboard.close();
  }
}
