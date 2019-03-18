/*  Calculating Area of a Circle
    Massoni
*/

import java.util.Scanner; // this imports the Scanner class


public class AreaOfACircle

{
   
   public static void main( String [] args )

  {
      Scanner scan = new Scanner( System.in );
      
      final double PI = 3.14159;
      
      System.out.println( "What is the radius of the circle?" );
      int radius = scan.nextInt ();
      
      double area =  PI * radius * radius;
      
      System.out.println ( "The area of a circle with a radius of "
                           + radius + " is " + area );
                              
   
   }
   
}