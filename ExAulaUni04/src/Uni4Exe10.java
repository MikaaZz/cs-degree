import java.util.Scanner;

/**
 * Uni4Exe10
 * Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
 * algoritmo para ler as idades dos filhos e exibir quem é o caçula da família;
 * suponha que não haja empates.
 */
public class Uni4Exe10 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Entre com a idade dos 3 filhos: ");
  int ageOfChildrenOne = keyboard.nextInt(), ageOfChildrenTwo = keyboard.nextInt(), ageOfChildrenThree = keyboard.nextInt();

  if(ageOfChildrenOne < ageOfChildrenTwo && ageOfChildrenOne < ageOfChildrenThree) {
   System.out.println("Crianca 01 cacula");
  } else if (ageOfChildrenTwo < ageOfChildrenOne && ageOfChildrenTwo < ageOfChildrenThree) {
   System.out.println("Crianca 02 cacula");
  } else {
   System.out.println("Crianca 03 cacula");
  }

  keyboard.close();
 }
}
