/**
 * Uni4Exe18
 * Uma loja que trabalha com crediário funciona da seguinte maneira: se o
 * pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é
 * avisado que o pagamento está em dia. Se o pagamento é realizado até cinco
 * dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa
 * mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um
 * algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da
 * prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas
 * mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os
 * clientes nunca deixam para pagar no mês seguinte.
 */
import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do vencimento (até o dia 10): ");
        int dueDate = scanner.nextInt();

        System.out.print("Digite o dia do pagamento: ");
        int paymentDate = scanner.nextInt();

        System.out.print("Digite o valor da prestação: R$ ");
        double installmentValue = scanner.nextDouble();

        int delayDays = paymentDate - dueDate;
        double finalValue;

        if (delayDays <= 0) {
            finalValue = installmentValue * 0.90; // 10% de desconto
            System.out.println("Pagamento em dia! Você obteve um desconto!");
        } else if (delayDays <= 5) {
            finalValue = installmentValue; // Sem desconto e sem multa
            System.out.println("Pagamento realizado com até 5 dias de atraso. Sem desconto.");
        } else {
            finalValue = installmentValue + (installmentValue * 0.02 * delayDays); // Multa de 2% por dia de atraso
            System.out.println("Pagamento com mais de 5 dias de atraso. Multa aplicada.");
        }

        System.out.println("Valor a ser pago: R$ " + finalValue);

        scanner.close();
    }
}

