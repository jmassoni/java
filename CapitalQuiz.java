/** Capital Quiz */

import java.io.*;
import java.util.*;

public class CapitalQuiz
{
   public static void main( String [] args ) throws IOException
   { 
     final int NUMBER_OF_STATES = 50;
     
     /****** 1. instantiate an array to hold 50 State objects */ 
     
     State [] set = new State[NUMBER_OF_STATES];
     
     /***** 2. set up Scanner to read from the file statecapitals.txt */
     
     Scanner file = new Scanner( new File( "StateCapitals.txt" ) );
     
       
     /***** 3. using a for loop, read the states and their capitals (each on its own line)
       * then create a State object and store it in the array 
         For example, if you have read the state name and capital, you can use this code 
         stateArray[i] = new State( stateName, capital );
     */
     
      for ( int i = 0; i < set.length; i++ )
      {
         String stateName = file.nextLine( );
         String capital = file.nextLine( );
         
         State c = new State( stateName, capital );
                 
         set[i] = c;
      }
     
   
     Scanner scan = new Scanner( System.in );
     Random rand = new Random( );
     
     /**** 4. We play the game until the user makes three incorrect guesses:
       * Set up counters for number of correct and incorrect guesses. 
       * The game is over when the user makes three incorrect guesses. 
       * Using a do/while loop, generate a random number between 0 and 49. 
       * Using that number, get the state name for that State object in the array
       * and ask the user to guess the capital. 
       * If the user is incorrect, call the toString method to display the correct capital. 
       * 
       * When the game is over, display the number of correct and incorrect guesses.
       */ 
     
     int numberCorrect = 0;
     int numberIncorrect = 0;
     
     
     
     do
     {
         int rIndex = rand.nextInt( NUMBER_OF_STATES );
         System.out.println("\nWhat is the capital of " + set[rIndex].getStateName() + "?");
         String answer = scan.nextLine();
         
         if( answer.equalsIgnoreCase(set[rIndex].getCapital()) )
         {
            
            numberCorrect++;
            System.out.println( "You were right. Big whoop." );
            
         }
         else
         {
            numberIncorrect++;
            System.out.println( "You were wrong. " + set[rIndex] + ".");
         }
         
     } while ( numberIncorrect < 3 );
      
      
     System.out.println( "\nGame over. You had " + numberCorrect + " answers correct and " + numberIncorrect + " answers incorrect." );     
     /*for ( int i = 0; i < set.length; i++ )
     {
         System.out.println( set[i] );
     }*/
     
   } // end main
} // end class