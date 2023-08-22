/*
  Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
  Para isto ela entregou um valor em dólares para o atendente.
  Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class Uni3Exe08 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Qual a o valor do dolar para o dia " + LocalDate.now() + " ?");
    final double VALUE_DOLAR = keyboard.nextDouble();
    System.out.println("Agora, digite o valor para cambio em Dolares: ");
    double amountOfDolarToChange = keyboard.nextDouble();

    double valueToRecieveInReal = amountOfDolarToChange * VALUE_DOLAR;
    System.out.println("Valor a ser recebido em reais: " + valueToRecieveInReal);

    keyboard.close();
  }
}
