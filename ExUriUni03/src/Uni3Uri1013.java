/**
 * Uni3Uri1013
 *
 *
 * Read an integer value, which is the duration in seconds of a certain event in
 * a factory, and inform it expressed in hours:minutes:seconds.
 * Input
 *
 * The input file contains an integer N.
 * Output
 *
 * Print the read time in the input file (seconds) converted in
 * hours:minutes:seconds like the following example.
 *
 */
import java.util.Scanner;

public class Uni3Uri1013 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int totalSeconds = keyboard.nextInt();
    int hours = totalSeconds / 3600;
    int remainingSeconds = totalSeconds % 3600;
    int minutes = remainingSeconds / 60;
    int seconds = remainingSeconds % 60;

    System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

    keyboard.close();
  }
}
