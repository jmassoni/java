import java.util.Scanner;
import java.util.ArrayList;

public class Roster {
   public static void main(String[] args) {      
      
      final int NUM_PLAYERS = 5;
      
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> players = new ArrayList<Integer>();
      int jerseyNum = 0;
      int playerRating = 0;
      
      for (int i = 0; i < NUM_PLAYERS; i++) {
         
         System.out.print("Enter a player's jersey number: ");
         jerseyNum = scan.nextInt();
         System.out.print("Enter a player's rating: ");
         playerRating = scan.nextInt();
         
         Player x = new Player(jerseyNum, playerRating);
      
      }
      
      System.out.println(x.getRating());
   }
}

