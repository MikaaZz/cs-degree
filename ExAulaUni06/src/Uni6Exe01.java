import java.util.Scanner;

/**
 * Uni6Exe01
 * Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor
 * de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos.
 * Faça um método para ler e outro para escrever.
 */
public class Uni6Exe01 {

 private static final int arraySize = 10;
 private static int array[] = new int[arraySize];

 public static void main(String[] args) {
  read();
  write();
 }

 public static void read() {
  Scanner scanner = new Scanner(System.in);
  for (int i = 0; i < arraySize; i++) {
   System.out.print("Vetor " + i + ": ");
   array[i] = scanner.nextInt();
  }
  scanner.close();
 }

 public static void write() {
  for (int i = arraySize - 1; i >= 0; i--) {
   System.out.print(array[i] + ", ");
  }
 }
}