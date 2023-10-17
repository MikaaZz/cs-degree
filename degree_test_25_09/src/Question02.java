import java.util.Scanner;

/**
 * Question02
 * Entrada:
 * 
 * Processo:
 * 
 * Saida:
 */
public class Question02 {
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Digite o valor da compra:");
  float purchasePrice = keyboard.nextFloat();

  System.out.println("Digite a forma de pagamento: Debito - 0 | Pix - 1 | Crediario - 2.");
  int paymentMethod = keyboard.nextInt();

  boolean paymentMethodIsValid = true;
  boolean isCrediariThePaymentMethod = false;

  int parcialPaymentCount = 1;
  int desiredPayDay = 1;
  int realPayDay = 1;

  double parcialPaymentValue = purchasePrice;
  double finalPrice = purchasePrice;
  double paymentDiscount = 0;

  switch (paymentMethod) {
   case 0:
    paymentDiscount = purchasePrice * .03;
    finalPrice = finalPrice + paymentDiscount;
    break;

   case 1:
    paymentDiscount = purchasePrice * .05;
    finalPrice = finalPrice - paymentDiscount;
    break;

   case 2:
    isCrediariThePaymentMethod = true;

    System.out.println("Digite em quantas vezes voce quer parcelar: ");
    parcialPaymentCount = keyboard.nextInt();

    System.out.println("Dia que sera pago: ");
    desiredPayDay = keyboard.nextInt();

    paymentDiscount = purchasePrice * .15;
    break;
   default:
    System.out.println("Entrada invalida");
    paymentMethodIsValid = false;
    break;
  }

  if (paymentMethodIsValid) {

   if (isCrediariThePaymentMethod) {

    System.out.println("Em que dia foi pago esta conta?");
    realPayDay = keyboard.nextInt();

    if (desiredPayDay + 10 >= realPayDay && desiredPayDay != realPayDay) {
     System.out.println("Voce nao tera desconto nenhum no seu pagamento!");
    } else if (desiredPayDay + 10 < realPayDay) {
     System.out.println("Desired payday: " + desiredPayDay);
     System.out.println("Voce recebera um acrescimo por dia de pagamento");

     int extraDays = (desiredPayDay + 10) - realPayDay;
     System.out.println("Quantidade de dias em atraso: " + extraDays);

     double extraValuePerDay = finalPrice * 0.02;
     System.out.println("Valor extra pago por dia: " + extraValuePerDay);

     finalPrice = extraValuePerDay * extraDays + finalPrice;
    } else {
     System.out.println("Voce pagou na data certa!");
     finalPrice = finalPrice - paymentDiscount;
    }
    parcialPaymentValue = finalPrice / parcialPaymentCount;
    System.out.println("Valor de cada parcela: " + parcialPaymentValue);
   } 
   System.out.println("Valor total a ser pago: " + finalPrice);
  }

  keyboard.close();
 }
}