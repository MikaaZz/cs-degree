/**
 * Uni4Exe14
 * Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está
 * entre 1 e 12, e se o day existe naquele mês. Note que fevereiro tem 29 days
 * em years bissextos, e 28 days em years não bissextos.
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * fluxograma:
 */
import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int day = scanner.nextInt();

        System.out.print("Informe o mês: ");
        int month = scanner.nextInt();

        System.out.print("Informe o ano: ");
        int year = scanner.nextInt();

        boolean validData = true;

        // Verifica se o year é bissexto
        boolean bissexto = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        if (month < 1 || month > 12) {
            validData = false; // Mês inválido
        } else if (day < 1) {
            validData = false; // day inválido
        } else if (month == 2) {
            if ((bissexto && day > 29) || (!bissexto && day > 28)) {
                validData = false; // Fevereiro, depende se o year é bissexto
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                validData = false; // Mês com 30 days
            }
        } else {
            if (day > 31) {
                validData = false; // Mês com 31 days
            }
        }

        if (validData) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }

        scanner.close();
    }
}
