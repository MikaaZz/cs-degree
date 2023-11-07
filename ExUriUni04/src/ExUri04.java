import java.util.Scanner;

public class ExUri04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Sorting the numbers using a simple if-else condition
        int first, second, third;

        if (a < b && a < c) {
            first = a;
            if (b < c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b < a && b < c) {
            first = b;
            if (a < c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a < b) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }

        // Printing the sorted numbers
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // Printing a blank line
        System.out.println();

        // Printing the numbers in the original order
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
    }
}
