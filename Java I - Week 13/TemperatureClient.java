/* Temperature Client */

import java.util.*;
import java.io.*;

public class TemperatureClient
{
   public static void main( String [] args ) throws IOException
   { 
     final int NUMBER_OF_DAYS = 31;
     final int array [] = new int[NUMBER_OF_DAYS];
     
     File file = new File("octobertemps.txt");
     Scanner scan = new Scanner(file);
     int temp = scan.nextInt( );
     TemperatureAnalyzer c = new TemperatureAnalyzer( temp );
     
     
     System.out.println( "The average temp for October was "
                          + c.getAverageTemp( ) +  ".");
         
    
   
   
   
   
   }
      
   
}