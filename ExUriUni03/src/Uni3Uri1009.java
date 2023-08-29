/**
 * Uni3Uri1009
 *
 *
 * Make a program that reads three floating point values: A, B and C. Then,
 * calculate and show:
 * a) the area of the rectangled triangle that has base A and height C.
 * b) the area of the radius's circle C. (pi = 3.14159)
 * c) the area of the trapezium which has A and B by base, and C by height.
 * d) the area of ​​the square that has side B.
 * e) the area of the rectangle that has sides A and B.
 * Input
 *
 * The input file contains three double values with one digit after the decimal
 * point.
 * Output
 *
 * The output file must contain 5 lines of data. Each line corresponds to one of
 * the areas described above, always with a corresponding message (in
 * Portuguese) and one space between the two points and the value. The value
 * calculated must be presented with 3 digits after the decimal point.
 *
 */
import java.util.Scanner;

public class Uni3Uri1009 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    double A = keyboard.nextDouble();
    double B = keyboard.nextDouble();
    double C = keyboard.nextDouble();
    double pi = 3.14159;

    // a) area of the rectangled triangle
    double triangleArea = 0.5 * A * C;
    System.out.printf("TRIANGULO: %.3f\n", triangleArea);

    // b) area of the circle
    double circleArea = pi * C * C;
    System.out.printf("CIRCULO: %.3f\n", circleArea);

    // c) area of the trapezium
    double trapeziumArea = 0.5 * (A + B) * C;
    System.out.printf("TRAPEZIO: %.3f\n", trapeziumArea);

    // d) area of the square
    double squareArea = B * B;
    System.out.printf("QUADRADO: %.3f\n", squareArea);

    // e) area of the rectangle
    double rectangleArea = A * B;
    System.out.printf("RETANGULO: %.3f\n", rectangleArea);

    keyboard.close();
  }
}
