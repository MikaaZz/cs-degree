/**
 * Uni4Exe22
 * Um aluno está em dúvida sobre o título que vai receber após concluir seu
 * curso de graduação. Considerando que o sistema apresenta 3 cursos disponíveis
 * (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de
 * Informação) descreva um algoritmo para ler a opção do aluno e escrever uma
 * mensagem informando o título que o aluno vai receber caso opte por aquele
 * curso. As titulações são respectivamente: "Bacharel em Ciência da
 * Computação", "Licenciado em Computação" e "Bacharel em Sistemas de
 * Informação".
 */
import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma das opções de curso:");
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas de Informação");
        
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Você receberá o título de: Bacharel em Ciência da Computação.");
        } else if (opcao == 2) {
            System.out.println("Você receberá o título de: Licenciado em Computação.");
        } else if (opcao == 3) {
            System.out.println("Você receberá o título de: Bacharel em Sistemas de Informação.");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

