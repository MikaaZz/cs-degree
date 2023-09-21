/**
 * Uni4Exe15
 * Elabore um algoritmo para exibir o valor de reajuste que um funcionário
 * receberá no seu salário. A empresa irá conceder 5% de reajuste para o
 * funcionário que for admitido há menos de 12 meses. Para funcionário admitido
 * entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve
 * solicitar ao usuário que digite a quantidade de meses que o funcionário foi
 * admitido.
 */
import java.util.Scanner;

public class Uni4Exe15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de meses que o funcionário foi admitido: ");
        int monthsAdmitted = scanner.nextInt();

        double adjustmentRate;

        if (monthsAdmitted <= 12) {
            adjustmentRate = 0.05; // Reajuste de 5%
        } else if (monthsAdmitted >= 13 && monthsAdmitted <= 48) {
            adjustmentRate = 0.07; // Reajuste de 7%
        } else {
            adjustmentRate = 0; // Sem reajuste
        }

        System.out.println("O funcionário receberá um reajuste de: " + (adjustmentRate * 100) + "%.");

        scanner.close();
    }
}

