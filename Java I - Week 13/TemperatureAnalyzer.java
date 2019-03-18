/* TemperatureAnalyzer */

import java.util.*;
import java.io.*;


public class TemperatureAnalyzer
{
   
   final int NUMBER_OF_DAYS = 31;
   
   //define instance variables
   private final int array [] = new int[NUMBER_OF_DAYS];
   
   File file = new File("octobertemps.txt");
   Scanner scan = new Scanner(file);
   
   
   //constructor
   public TemperatureAnalyzer( int newTemp ) throws IOException
   {
      int temp = newTemp;
      temp = scan.nextInt(); 
   }
   
   int counter = 0;
   double total = 0;
   double avg = 0;

   
   //methods
   public double getAverageTemp( )
   {
      if (scan.hasNextInt( ))
      {
         counter++;
      }
      
      for ( int i = 0; i < array.length; i++ )
      {
         
         total += array[i];
         avg = total / (double) counter;   
      }
         double averageTemp = avg;
      
      return averageTemp; 
   }
   
   /*public int maxTemp( )
   {
      return maxTemp; //for loop
   }
   
   public int minTemp( )
   {
      return minTemp; //for loop
   }
   
   
   public int getTemp( int day )
   {
      return temp;
   }*/
   
   

}