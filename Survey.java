/** Survey snippet */

import java.io.*;
import java.util.*;

public class Survey
{
  public static void main( String[] args ) throws IOException
  {
    File inputFile = new File( "answers.txt" );
    Scanner file = new Scanner( inputFile );
    
    /****** 1. instantiate an array of counters with 5 elements */
    
    final int NUMBER_OF_OPTIONS = 5;
    int[] counters = new int[NUMBER_OF_OPTIONS];
    
    /****** 2. instantiate a parallel array of response labels:
      *   Poor, Fair, Good, Very Good and Excellent */
    String [] responses = { "Poor", "Fair", "Good", "Very Good", "Excellent" };
  
    /****** 3. read the answers from the file 
    *     and increment the appropriate counter  */
    
    while(file.hasNext() )
    {
      int answer = file.nextInt();
      counters[answer]++;
    }
  
    /****** 4. output the results with labels */
    
    System.out.println( "Count\tValue" );
    for ( int i = 0; i < counters.length; i++ )
    {
    
      System.out.print( counters[i] + "\t\t"  );
      for ( int j = 1; j <=counters[i]; j++ )
      {
         System.out.print("*");
      }
      System.out.println( );
    }
    
    int max = 0;
    for ( int i = 0; i < counters.length; i++ )
    {
      if ( counters[i] > counters[max] )
      {
         max = i;
      }
    }
    
    System.out.println( "\nAnd the winner is " + responses[max] + ".");

    
    
  } // end main
 
} // end class