
/**
 * Uni3Uri1004
 *

Read two floating points' values of double precision A and B, corresponding to two student's grades.
After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5.
Each grade can be from zero to ten, always with one digit after the decimal point.
Don’t forget to print the end of line after the result, otherwise you will receive “Presentation Error”. Don’t forget the space before and after the equal sign.

Input
The input file contains 2 floating points' values with one digit after the decimal point.

Output
Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, with 5 digits after the decimal point and with a blank space before and after the equal signal.

 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1004 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat df_5 = new DecimalFormat("0.00000");
    final double WEIGHT_A = 3.5, WEIGHT_B = 7.5;

    float A = keyboard.nextFloat(), B = keyboard.nextFloat();
    double MEDIA = (A * WEIGHT_A + B * WEIGHT_B) / (WEIGHT_A + WEIGHT_B);

    System.out.println("MEDIA = " + df_5.format(MEDIA));

    keyboard.close();
  }
}
