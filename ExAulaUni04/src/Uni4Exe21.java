/**
 * Uni4Exe21
 * O índice de massa corporal (IMC) é uma medida internacional usada para
 * calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão
 * da massa do indivíduo pelo quadrado de sua altura, onde a massa está em
 * quilogramas e a altura está em metros, de acordo com a fórmula:
 *
 * \normalsize&space;IMC=\frac{Massa}{Altura^2}
 *
 * Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
 * indivíduo, de acordo com a seguinte tabela:
 * IMC Classificação
 * < 18.5 Magreza
 * 18.5 - 24.9 Saudável
 * 25.0 - 29.9 Sobrepeso
 * 30.0 - 34.9 Obesidade Grau I
 * 35.0 - 39.9 Obesidade Grau II (severa)
 * >= 40.0 Obesidade Grau III (mórbida)
 */
import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua massa em quilogramas: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = massa / (altura * altura);

        String classificacao = "";

        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Saudável";
        } else if (imc >= 25.0 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30.0 && imc < 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc >= 35.0 && imc < 39.9) {
            classificacao = "Obesidade Grau II (severa)";
        } else if (imc >= 40.0) {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}

