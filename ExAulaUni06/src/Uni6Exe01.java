import java.util.Scanner;

/**
 * Uni6Exe01
 * Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor
 * de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos.
 * Faça um método para ler e outro para escrever.
 */
public class Uni6Exe01 {

 public static void main(String[] args) {
  int arraySize = 10;
  int array[] = new int[arraySize];
  read(arraySize, array);
  write(arraySize, array);
 }

 public static void read(int arraySize, int array[]) {
  Scanner scanner = new Scanner(System.in);
  for (int i = 0; i < arraySize; i++) {
   System.out.print("Vetor " + i + ": ");
   array[i] = scanner.nextInt();
  }
  scanner.close();
 }

 public static void write(int arraySize, int array[]) {
  for (int i = arraySize - 1; i >= 0; i--) {
   System.out.print(array[i] + ", ");
  }
 }
}