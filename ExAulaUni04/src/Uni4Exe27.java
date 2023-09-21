/**
 * Uni4Exe27
 * As tarifas de um estacionamento são as seguintes:
 *
 * 1° e 2° hora - R$ 5,00 cada
 * 3° e 4° hora - R$ 7,50 cada
 * 5° hora e seguintes - R$ 10,00 cada
 *
 * O número de horas a pagar é sempre inteiro e arredondado para cima ou para
 * baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se
 * para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem
 * estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar
 * por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa
 * permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de
 * chegada e partida são apresentados na forma de pares de inteiros,
 * representando horas e minutos. Por exemplo, o par 12 50 representará meio dia
 * e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de
 * partida e escreva na tela o tempo que ficou estacionado, e o preço a ser
 * cobrado. Deverá haver validação de dados. Admite-se que a chegada e a partida
 * se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo
 * dia.
 */
import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora de chegada (0-23): ");
        int arrivalHour = scanner.nextInt();

        System.out.print("Informe o minuto de chegada (0-59): ");
        int arrivalMinute = scanner.nextInt();

        System.out.print("Informe a hora de partida (0-23): ");
        int departureHour = scanner.nextInt();

        System.out.print("Informe o minuto de partida (0-59): ");
        int departureMinute = scanner.nextInt();

        if (arrivalHour >= 0 && arrivalHour < 24 && departureHour >= 0 && departureHour < 24 &&
            arrivalMinute >= 0 && arrivalMinute < 60 && departureMinute >= 0 && departureMinute < 60 &&
            (departureHour > arrivalHour || (departureHour == arrivalHour && departureMinute > arrivalMinute))) {

            int totalMinutes = (departureHour - arrivalHour) * 60 + (departureMinute - arrivalMinute);

            int hoursToPay = totalMinutes / 60;
            if (totalMinutes % 60 > 29) {
                hoursToPay++;
            }

            double totalToPay = 0;
            switch (hoursToPay) {
                case 1:
                    totalToPay = 5;
                    break;
                case 2:
                    totalToPay = 10;
                    break;
                case 3:
                    totalToPay = 17.50;
                    break;
                case 4:
                    totalToPay = 25;
                    break;
                default:
                    totalToPay = 25 + (hoursToPay - 4) * 10;
            }

            System.out.println("Tempo estacionado: " + hoursToPay + " horas");
            System.out.println("Preço a ser pago: R$ " + totalToPay);
        } else {
            System.out.println("Dados inválidos!");
        }

        scanner.close();
    }
}

