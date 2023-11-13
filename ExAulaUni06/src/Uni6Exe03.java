// Uni6Exe03.java - Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.

import java.util.Scanner;

public class Uni6Exe03 {
 private Scanner scanner = new Scanner(System.in);

 private Uni6Exe03() {
  int arrSize = 12;
  double arr[] = new double[arrSize];

  arrRead(arr);
  arrFix(arr);
  arrShow(arr);

  scanner.close();
 }

 private void arrRead(double[] arr) {
  for (int i = 0; i < arr.length; i++) {
   System.out.print("Arr[" + i + "]:");
   arr[i] = scanner.nextDouble();
  }
 }

 private void arrFix(double[] arr) {
  for (int i = 0; i < arr.length; i += 2) {
   arr[i] += arr[i] * .02;
  }
  for (int i = 1; i < arr.length; i += 2) {
   arr[i] += arr[i] * .05;
  }
 }

 private void arrShow(double[] arr) {
  for (int i = 0; i < arr.length; i++) {
   System.out.println("Arr[" + i + "]: " + arr[i]);
  }
 }

 public static void main(String[] args) {
  new Uni6Exe03();
 }
}
