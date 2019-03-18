import java.util.Scanner;

public class GameBoardPrinter {
   public static void printTicTacToe(char horizChar, char vertChar) {

      /* Your solution goes here  */
      
      
      
         for(int i = 0; i <= 1; i++){
     
            System.out.print("x" + vertChar);
            
         }
      
         System.out.println("x");
      
         
         for(int x = 0; x <= 3; x++){
      
            System.out.print(horizChar);
      
         }
         
         System.out.println(horizChar);
         
         for(int i = 0; i <= 1; i++){
     
            System.out.print("x" + vertChar);
            
         }
      
         System.out.println("x");
         
         for(int x = 0; x <= 3; x++){
      
            System.out.print(horizChar);
      
         }
         
         System.out.println(horizChar);
         
         for(int i = 0; i <= 1; i++){
     
            System.out.print("x" + vertChar);
            
         }
      
         System.out.println("x");
      
      
      return;
   }

   public static void main (String [] args) {
      printTicTacToe('~', '!');

      return;
   }
}
