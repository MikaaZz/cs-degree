import java.util.Scanner;

/**
 * Uni4Exe11
 * Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma
 * mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere
 * que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
 * dos demais, e apenas irmãos se todas as idades forem diferentes.
 */
public class Uni4Exe11 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Entre com o ano de nascimento dos 3 filhos: ");
  int yearOfChildrenOne = keyboard.nextInt(), yearOfChildrenTwo = keyboard.nextInt(),
    yearOfChildrenThree = keyboard.nextInt();

  if (yearOfChildrenOne == yearOfChildrenTwo && yearOfChildrenOne == yearOfChildrenThree) {
   System.out.println("Os irmaos sao trigemeos");
  } else if (yearOfChildrenOne == yearOfChildrenTwo || yearOfChildrenOne == yearOfChildrenThree) {
   if (yearOfChildrenOne == yearOfChildrenTwo) {
    System.out.println("Irmaos 01 e 02 sao gemeos");
   } else {
    System.out.println("Irmaos 02 e 03 sao gemeos");
   }
  } else {
   System.out.println("Nenhum irmao gemeo");
  }

  keyboard.close();
 }
}
