
/**
 * Uni3Uri1008
 *
 *
 * In this problem, the task is to read a code of a product 1, the number of
 * units of product 1, the price for one unit of product 1, the code of a
 * product 2, the number of units of product 2 and the price for one unit of
 * product 2. After this, calculate and show the amount to be paid.
 * Input
 *
 * The input file contains two lines of data. In each line there will be 3
 * values: two integers and a floating value with 2 digits after the decimal
 * point.
 * Output
 *
 * The output file must be a message like the following example where "Valor a
 * pagar" means Value to Pay. Remember the space after ":" and after "R$"
 * symbol. The value must be presented with 2 digits after the point.
 *
 */
import java.util.Scanner;

public class Uni3Uri1008 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int code1 = keyboard.nextInt();
    int quantity1 = keyboard.nextInt();
    double unitPrice1 = keyboard.nextDouble();

    int code2 = keyboard.nextInt();
    int quantity2 = keyboard.nextInt();
    double unitPrice2 = keyboard.nextDouble();

    double totalCost1 = quantity1 * unitPrice1;
    double totalCost2 = quantity2 * unitPrice2;

    double totalAmount = totalCost1 + totalCost2;

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAmount);

    keyboard.close();
  }
}
