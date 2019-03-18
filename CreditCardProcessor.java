import java.util.Scanner;

public class CreditCardProcessor {

   public static void main(String[] args) {  
      
      CreditCard cc = new CreditCard();
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter your cc name: ");
      String userName = scan.next();
      
      cc.setName(userName);
      System.out.println(cc.getName());
      
      System.out.println("Enter your cc number: ");
      int userNumber = scan.nextInt();
      
      cc.setNumber(userNumber);
      System.out.println(cc.getNumber());
      
      System.out.println(cc.validLength());
      
      System.out.println(cc.toString());

      System.out.println(cc.test());      
   }
}