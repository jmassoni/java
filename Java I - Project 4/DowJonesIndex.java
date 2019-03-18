/* Project 4
   Joey Massoni
*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class DowJonesIndex
{
  public static void main( String [] args ) throws IOException
  {
    
    
    //instantianting scanner for the file and decimal formats for ouput
    Scanner file = new Scanner( new File( "dja.txt" ) );
    DecimalFormat percent = new DecimalFormat( "0.0#%" );
    DecimalFormat money = new DecimalFormat( "$#.00" );


    //initializing variables to be used in calculations
    int counter = 1;
    int high = 0;
    double percentage = 0;
    double highestValue = Double.MIN_VALUE;
    String highestDay = "";
    double total = 0;
    double avg = 0;
    
    
    //while statement to read each variable found in file
    while ( file.hasNext( ))
    {
    
    
      //initializing variables that will be found in file
      String date = file.next( );
      double dja = file.nextDouble( );
        
        
      //calculating number of dja
      if (file.hasNext())
      {
         counter++;
      }  
      
      
      //calulating values at/above 18355
      if ( dja >= 18355 )
      {
         high++;
         percentage = (double) high / counter;
      }
      
      
      //calculcating highest value
      if ( dja > highestValue )
      {
         highestValue = dja;
         highestDay = date;
      }
         
         
      //calculating average
      total += dja;
      avg = total / (double) counter;
         
              
    }
       
        
      System.out.println( "\nThere are " + counter + " closing values in the file.");
      System.out.println( "\n" + percent.format (percentage)
                              + " of the values in the file are at or above $18,355.");
      System.out.println( "\nThe highest closing value was "
                              + money.format(highestValue)
                              + " and occured on " + highestDay + ".");
      System.out.println( "\nThe average of all values is " 
                              + money.format (avg) + ".");
   
   
  }
}
