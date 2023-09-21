/**
 * Uni4Exe17
 * Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda
 * anual e o número de dependentes do contribuinte. A renda líquida é calculada
 * sobre a renda anual com um desconto de 2% para cada dependente do
 * contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não
 * paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$
 * 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas
 * líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$
 * 10.000,00 pagam 15% de imposto.
 */
import java.util.Scanner;

public class Uni4Exe17 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a renda anual: R$ ");
        double annualIncome = scanner.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int numberOfDependents = scanner.nextInt();

        double discount = (annualIncome * (0.02 * numberOfDependents));
        double netIncome = annualIncome - discount;
        double tax = 0;

        if (netIncome <= 2000) {
            System.out.println("Não há imposto a ser pago.");
        } else if (netIncome > 2000 && netIncome <= 5000) {
            tax = netIncome * 0.05;
            System.out.println("O imposto a ser pago é: R$ " + tax);
        } else if (netIncome > 5000 && netIncome <= 10000) {
            tax = netIncome * 0.10;
            System.out.println("O imposto a ser pago é: R$ " + tax);
        } else {
            tax = netIncome * 0.15;
            System.out.println("O imposto a ser pago é: R$ " + tax);
        }

        scanner.close();
    }
}

