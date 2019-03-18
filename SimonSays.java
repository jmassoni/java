import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      String simonPattern = "";
      String userPattern = "";
      int userScore = 0;
      int i = 0;

      userScore = 0;
      simonPattern = "RRGBRYYBGY";
      userPattern  = "RRGBBRYBGY";

      /* Your solution goes here  */
      
      
      for (i = 0; i <= 10; i++){
       if(simonPattern.charAt(i) == userPattern.charAt(i)){
        userScore++;
          
       }
       else
       {
       break;
       }
       
         
      }

      System.out.println("userScore: " + userScore);

      return;
   }
}