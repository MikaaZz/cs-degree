/**
 * Question01
 */
public class Question01 {
 public static void main(String[] args) {
  String nivel = "alto", altura = "";
  if (nivel.equals("") && altura.equals("")) {
   System.out.println("Nivel e Altura");
  } else {
   System.out.println("Teste altura");
   if (altura.equals("")) {
    System.out.println("Altura vazia");
    System.out.println("Nivel vazio");
   } else {
    System.out.println("Altura cadastrada");
   }
  }
  System.out.println("Outro Nivel");
 }
}