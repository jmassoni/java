import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class Test
{
   public static void main( String [] args )
   {
      int [] a = new int[100];
      Random rand = new Random();
      
      
      int max = 0;
            
      
      for ( int i = 0; i < a.length; i++ )
      {
         a[i] = rand.nextInt( 11 ) + 10;
         
         
         if ( a[i] > max )
         {
                  
         max = a[i];
         
         }
      
         System.out.println( a[i] );
      }
      
      
      System.out.println( "\n" + a.length() );
         
         
 }
}