/**
 * Uni4Exe19
 * Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual
 * quadrante ele está localizado
 *
 * 0, se os dois valores forem zero
 * 1, se os dois valores forem positivos
 * 2, se x for positivo e y, negativo
 * 3, se os dois valores forem negativos
 * 4, se x for negativo e y, positivo
 * Para resolver este problema pode se utilizar do algoritmo descrito no
 * fluxograma:
 */
import java.util.Scanner;

public class Uni4Exe19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite a coordenada Y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("0 - Os dois valores são zero.");
        } else if (x > 0 && y > 0) {
            System.out.println("1 - Ambos os valores são positivos.");
        } else if (x > 0 && y < 0) {
            System.out.println("2 - X é positivo e Y é negativo.");
        } else if (x < 0 && y < 0) {
            System.out.println("3 - Ambos os valores são negativos.");
        } else if (x < 0 && y > 0) {
            System.out.println("4 - X é negativo e Y é positivo.");
        }

        scanner.close();
    }
}

