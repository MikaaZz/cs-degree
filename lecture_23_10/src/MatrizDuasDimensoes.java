public class MatrizDuasDimensoes {
 public static void main(String[] args) {
  final int matRow = 2;
  final int matCol = 3;
  int mat[][] = new int[matRow][matCol];

  /*
   * [
   * [1],[3],[5],
   * [2],[4],[6]
   * ]
   */

  // Primeiro valor acessa uma dimensao e o segundo outra dimensao,
  // nao afetando Largura e Altura
  int count = 1;
  for (int i = 0; i < matRow; i++) {
   for (int j = 0; j < matCol; j++) {
    System.out.println("[" + i + "," + j + "]");
    mat[i][j] = count;
    count++;
   }
  }
  for (int j = 0; j < matRow; j++) {
   for (int i = 0; i < matCol; i++) {
    System.out.println("[" + i + "," + j + "]");
    mat[i][j] = count;
    count++;
   }
  }

 }
}
