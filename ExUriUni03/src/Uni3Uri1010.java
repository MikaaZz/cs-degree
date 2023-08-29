/**
 * Uni3Uri1010
 *
 *
 * Read the four values corresponding to the x and y axes of two points in the
 * plane, p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them,
 * showing four decimal places after the comma, according to the formula:
 *
 * Distance =
 * Input
 *
 * The input file contains two lines of data. The first one contains two double
 * values: x1 y1 and the second one also contains two double values with one
 * digit after the decimal point: x2 y2.
 * Output
 *
 * Calculate and print the distance value using the provided formula, with 4
 * digits after the decimal point.
 *
 */
import java.util.Scanner;

public class Uni3Uri1010 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    double x1 = keyboard.nextDouble();
    double y1 = keyboard.nextDouble();
    double x2 = keyboard.nextDouble();
    double y2 = keyboard.nextDouble();

    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.printf("%.4f\n", distance);

    keyboard.close();
  }
}
