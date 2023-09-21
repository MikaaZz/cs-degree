/**
 * Uni4Exe20
 * Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
 * descreva um algoritmo que calcule a média de aproveitamento e o conceito do
 * aluno, usando a fórmula:
 *
 * \normalsize&space;media=(notaProva1+notaProva22+notaProva33+notaExercicios)/7
 *
 * A atribuição dos conceitos obedece à tabela abaixo:
 * media conceito
 * >= 9.0 A
 * >= 7.5 e < 9.0 B
 * >= 6.0 e < 7.5 C
 * >= 4.0 e < 6.0 D
 * < 4.0 E
 *
 * O algoritmo deve escrever a média de aproveitamento, o conceito
 * correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e
 * "reprovado" caso o conceito seja D ou E.
 */
import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double notaProva3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double notaExercicios = scanner.nextDouble();

        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

        String conceito = "";
        String status = "";

        if (media >= 9.0) {
            conceito = "A";
            status = "aprovado";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
            status = "aprovado";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
            status = "aprovado";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
            status = "reprovado";
        } else if (media < 4.0) {
            conceito = "E";
            status = "reprovado";
        }

        System.out.println("Média de aproveitamento: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + status);

        scanner.close();
    }
}

