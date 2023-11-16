import java.util.Scanner;

public class MikhaelZimmermann_2 {

 private MikhaelZimmermann_2() {
  Scanner teclado = new Scanner(System.in);

  System.out.print("Tamanho do vetor: ");
  int arraySize = teclado.nextInt();
  int vet1[] = new int[arraySize], vet2[] = new int[arraySize], vetSoma[] = new int[arraySize];
  vetLer(vet1, "VetA", teclado);
  vetLer(vet2, "VetB", teclado);
  vetSoma(vet1, vet2, vetSoma);
  vetOrdenar(vetSoma);
  vetEscrever(vetSoma);
  teclado.close();
 }

 private void vetLer(int vet[], String vetStr, Scanner teclado) {
  System.out.println("___ Lendo o " + vetStr + "___");
  for (int i = 0; i < vet.length; i++) {
   System.out.print(vetStr + "[" + i + "]:");
   vet[i] = teclado.nextInt();
  }
 }

 private void vetSoma(int vet1[], int vet2[], int vetSoma[]) {
  for (int i = 0; i < vetSoma.length; i++) {
   vetSoma[i] = vet1[i] + vet2[i];
  }
 }

 private void vetOrdenar(int vetSoma[]) {
  int n = vetSoma.length;
  for (int i = 0; i < n - 1; i++) {
   for (int j = 0; j < n - 1; j++) {
    if (vetSoma[j] > vetSoma[j + 1]) {
     int temp = vetSoma[j];
     vetSoma[j] = vetSoma[j + 1];
     vetSoma[j + 1] = temp;
    }
   }
  }
 }

 private void vetEscrever(int vetSoma[]) {
  System.out.println("_ valores ordenados.");
  System.out.println("__ Resultado __");
  for (int i = 0; i < vetSoma.length; i++) {
   System.out.println("VetSoma[" + i + "]: " + vetSoma[i]);
  }
 }

 public static void main(String[] args) {
  new MikhaelZimmermann_2();
 }
}
