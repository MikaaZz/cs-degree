/*
  Uma empresa tem para um funcionário os seguintes dados:
  o nome, o número de horas trabalhadas mensais e o número de dependentes.
  A empresa paga
  R$ 10,00 por hora (valor para cálculo do salário trabalho)
  e R$ 60,00 por dependente (valor para cálculo do salário família)
  e são feitos descontos de 8,5% sobre o salário trabalho para o INSS
  e de 5% sobre o salário trabalho para o imposto de renda.
  Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
 */

import java.util.Scanner;

public class Uni3Exe12 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final double VALUE_PER_HOUR = 10.00, VALUE_PER_DEPENDENCIE = 60.00;
    final double INSS_DISCOUNT = 8.5, INCOME_TAX = 5.0;

    System.out.println("Digite o nome do funcionario: ");
    String name = keyboard.nextLine();

    System.out.println("Horas trabalhadas do funcionario ( Mensais ): ");
    double workedHours = keyboard.nextDouble();

    System.out.println("Quantidade de dependentes: ");
    int dependencies = keyboard.nextInt();

    double salaryFromWork = workedHours * VALUE_PER_HOUR;
    double salaryFromFamily = dependencies * VALUE_PER_DEPENDENCIE;

    double totalINSSDiscount = (salaryFromWork * INSS_DISCOUNT) / 100;
    double totalIncomeTax = (salaryFromWork * INCOME_TAX) / 100;

    double salaryWithoutDiscount = salaryFromWork + salaryFromFamily;
    double salaryWithDiscount = salaryWithoutDiscount - (totalINSSDiscount + totalIncomeTax);

    System.out.println("Nome do funcionario: " + name);
    System.out.println("Salario bruto: " + salaryWithoutDiscount);
    System.out.println("Salario liquido: " + salaryWithDiscount);

    keyboard.close();
  }
}
