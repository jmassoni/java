/* Lab 6 
*  Joey Massoni
*/

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;


public class lab6 
{  

  public static void main( String [] args ) throws IOException
  {
     
     DecimalFormat money = new DecimalFormat( "$#.00" );
     DecimalFormat transactions = new DecimalFormat( "0" );
     
     File inFile = new File( "transactions.txt" );
     Scanner file = new Scanner( inFile );
     
     String accountNumber = file.next( );
     String name = file.next ( );
     double balance = file.nextDouble ( );
     double deposits = 0;
     double withdrawls = 0;
     double minBalance = 20000;
     
     while ( file.hasNext( ))
     {
         String type = file.next ( );
         double transaction = file.nextDouble ( );
         if (type.equals("Deposit"))
         {
            balance += transaction;
            deposits++;
         }
         else
         {
            balance -= transaction;
            withdrawls++;
         }
         
         if ( balance < minBalance )
         {
            minBalance = balance;
         }
     }
      
     System.out.println("The final balance is " + money.format(balance) + ".");
     System.out.println("There were " + transactions.format(deposits) + " deposits.");
     System.out.println("There were " + transactions.format(withdrawls) + " withdrawls.");
     System.out.println("The lowest balance was " + money.format(minBalance));
  }
}