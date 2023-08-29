
/**
 * Uni3Uri1007
 *
 *
 * Make a program that reads a seller's name, his/her fixed salary and the
 * sale's total made by himself/herself in the month (in money). Considering
 * that this seller receives 15% over all products sold, write the final salary
 * (total) of this seller at the end of the month , with two decimal places.
 *
 * - Don’t forget to print the line's end after the result, otherwise you will
 * receive “Presentation Error”.
 *
 * - Don’t forget the blank spaces.
 * Input
 *
 * The input file contains a text (employee's first name), and two double
 * precision values, that are the seller's salary and the total value sold by
 * him/her.
 * Output
 *
 * Print the seller's total salary, according to the given example.
 *
 */
import java.util.Scanner;

public class Uni3Uri1007 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String sellerName = keyboard.nextLine();

    double fixedSalary = keyboard.nextDouble();
    double totalSales = keyboard.nextDouble();

    double commission = totalSales * 0.15;
    double finalSalary = fixedSalary + commission;

    System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
    keyboard.close();
  }
}
