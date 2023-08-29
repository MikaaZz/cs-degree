/**
 * Uni3Uri1012
 *
 *
 * In this problem you have to read an integer value and calculate the smallest
 * possible number of banknotes in which the value may be decomposed. The
 * possible banknotes are 100, 50, 20, 10, 5, 2 and 1. Print the read value and
 * the list of banknotes.
 * Input
 *
 * The input file contains an integer value N (0 < N < 1000000).
 * Output
 *
 * Print the read number and the minimum quantity of each necessary banknotes in
 * Portuguese language, as the given example. Do not forget to print the end of
 * line after each line, otherwise you will receive “Presentation Error”.
 *
 */
import java.util.Scanner;

public class Uni3Uri1012 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int N = keyboard.nextInt();
    System.out.println(N);

    int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

    for (int note : banknotes) {
      int numberOfNotes = N / note;
      System.out.println(numberOfNotes + " nota(s) de R$ " + note + ",00");
      N = N % note;
    }

    keyboard.close();
  }
}
