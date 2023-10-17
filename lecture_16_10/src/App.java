import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qtd de impressao: ");

        int print = scanner.nextInt();

        for (int i = 1; i <= print; i++) {
            System.out.println("Imprimindo a pagina usando FOR: " + i);
        }

        int i = 1;

        while (i != print + 1) {
            System.out.println("Imprimindo a pagina usando WHILE: " + i);
            i++;
        }

        scanner.close();
    }
}
