/* Lab 7
   Joey Massoni
*/
import javax.swing.JOptionPane;
import java.util.*;

public class Lab7
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner( System.in );
    String pw;
    int num = 0;
    int up = 0;
    
    do
    {
         System.out.println( "Enter a password with at least two numbers, " +
                                 "one uppercase character and at least 8 characters." );
         pw = scan.next( );
         num = 0;
         up = 0;
         
         for (int i = 0; i < pw.length(); i++)
         {
            char c = pw.charAt( i );
            if ( Character.isDigit( c ) )
            {
                  num++;
                  
            }
            if ( Character.isUpperCase( c ) )
            {
                  up += 1;
            }
         }

         
    } while ( pw.length() < 8 || num < 2 || up < 1);
    
    System.out.println( "Password accepted." );
   
  }
}
