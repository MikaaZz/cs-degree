
/*/ 
Duas chapas:

Total de votos chapa 01
Total de votos chapa 02
Total de votos nulos
Total geral de votos
*/
import java.util.Scanner;

public class MikhaelZimmermann_1 {

 public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int votesChapa1 = 0, votesChapa2 = 0, votesNull = 0;
  boolean isVotting = true;

  do {
   System.out.println("______ Eleicoes ______");
   System.out.println("1 - Voto Chapa1");
   System.out.println("2 - Voto Chapa2");
   System.out.println("3 - Voto Nulo");
   System.out.println("0 - Encerrar votacao");
   int userOption = teclado.nextInt();
   switch (userOption) {
    case 0:
     isVotting = false;
     System.out.println("** Resultados Eleicoes **");
     System.out.println("Votos Chapa1: " + votesChapa1);
     System.out.println("Votos Chapa2: " + votesChapa2);
     System.out.println("Votos Nulos: " + votesNull);
     System.out.println("Total votos: " + (votesChapa1 + votesChapa2 + votesNull));
     break;
    case 1:
     votesChapa1++;
     break;
    case 2:
     votesChapa2++;
     break;
    case 3:
     votesNull++;
     break;

    default:
     System.out.println("Opcao Errada");
     break;
   }
  } while (isVotting);
  teclado.close();
 }
}
