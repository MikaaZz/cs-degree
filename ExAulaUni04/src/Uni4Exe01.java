import java.util.Scanner;

/**
 * Uni4Exe01
 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
 * hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
 * de horas trabalhadas em um mês, o valor por hora e escreva o salário total do
 * funcionário, que deverá ser acrescido das horas extras, caso tenham sido
 * trabalhadas (considere que o mês possua 4 semanas exatas).
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 *
 */
public class Uni4Exe01 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Digite as horas mensais trabalhadas e apos, o valor da hora trabalhada: ");
    double hourWorked = keyboard.nextDouble(), hourValue = keyboard.nextDouble(), salaryExtra, salaryTotal = hourWorked * hourValue;

    if (hourWorked > 160) {
      salaryExtra = (hourWorked - 160) * (hourValue / 2);
      salaryTotal = salaryTotal + salaryExtra;
    }

    System.out.println("Salario do Trabalhador: " + salaryTotal);
    keyboard.close();
  }
}
