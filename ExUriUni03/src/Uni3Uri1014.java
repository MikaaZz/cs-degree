/**
 * Uni3Uri1014
 *
 *
 * Read a value of floating point with two decimal places. This represents a
 * monetary value. After this, calculate the smallest possible number of notes
 * and coins on which the value can be decomposed. The considered notes are of
 * 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05
 * and 0.01. Print the message “NOTAS:” followed by the list of notes and the
 * message “MOEDAS:” followed by the list of coins.
 * Input
 *
 * The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).
 * Output
 *
 * Print the minimum quantity of banknotes and coins necessary to change the
 * initial value, as the given example.
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1014 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double N = keyboard.nextDouble();
        int n = (int) (N * 100);

        int notes[] = {10000, 5000, 2000, 1000, 500, 200};
        int coins[] = {100, 50, 25, 10, 5, 1};

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("NOTAS:");

        for (int note : notes) {
            int count = n / note;
            n %= note;
            System.out.println(count + " nota(s) de R$ " + df.format((double) note / 100));
        }

        System.out.println("MOEDAS:");

        for (int coin : coins) {
            int count = n / coin;
            n %= coin;
            System.out.println(count + " moeda(s) de R$ " + df.format((double) coin / 100));
        }

        keyboard.close();
    }
}
