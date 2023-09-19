import java.util.Scanner;

/**
 * Calculator
 * -------
 * Read data
 * number
 * calculator method
 * -------
 * Result
 * result of the calc
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double result = 0;
        boolean noDivZero = true;

        System.out.println("Termo 01: ");
        double term01 = keyboard.nextDouble();

        System.out.println("Operator: ");
        char operator = keyboard.next().charAt(0);

        System.out.println("Termo 02: ");
        double term02 = keyboard.nextDouble();

        switch (operator) {
            case '+':
                result = term01 + term02;
                break;
            case '-':
                result = term01 - term02;
                break;
            case '*':
                result = term01 * term02;
                break;
            case '/':
                if (term02 == 0) {
                    System.out.println("Imp dividir por 0");
                    noDivZero = false;
                } else {
                    result = term01 / term02;
                }
                break;
            default:
                System.out.println("Operador invalido!");
                break;
        }

        if (noDivZero)
            System.out.println("Resultado: " + result);

        keyboard.close();
    }
}