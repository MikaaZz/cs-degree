// Entradas ? Notas ( n1, n2, n3 )
// Processo ? Soma das 3 notas e divisao da soma por 3
// Saida    ? Media do aluno

public class Mikhael {
  public static void main(String[] args) throws Exception {
    // Entrada
    double n1 = 8.5, n2 = 6, n3 = 7.5;
    //Processo
    double media = calculateMedia(n1, n2, n3);
    // Saida
    System.out.println("Media do Aluno: " + media);
  }

  static double calculateMedia(Double n1, Double n2, Double n3) {
    double media = (n1 + n2 + n3) / 3;
    return media;
  }
}
