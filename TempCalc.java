//Calculating tempertare 
//Massoni

import java.util.Scanner;


public class TempCalc
{
   
  public static void main( String [] args )
  {

      Scanner scan = new Scanner( System.in );
      
      System.out.println( "What is the temperature in degrees Fahrenheit?" );
      int fTemp = scan.nextInt ();
      
      double cTemp = (double) 5/9 * (fTemp - 32);
      
      System.out.println( "The temperature in degrees Celsius is " + cTemp + "." );
 
  }

}