import java.util.Scanner;

public class ExUri02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();

        if (number < 0 || number > 100) {
            System.out.println("Fora de intervalo");
        } else if (number <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (number <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (number <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        scanner.close();
    }
}
