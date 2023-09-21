import java.util.Scanner;

public class ExUri01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startTime = scanner.nextInt();
        int endTime = scanner.nextInt();
        int duration;

        if (startTime == endTime) {
            duration = 24;
        } else if (endTime > startTime) {
            duration = endTime - startTime;
        } else {
            duration = (24 - startTime) + endTime;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");

        scanner.close();
    }
}
