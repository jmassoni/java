/* Project 2
*  Joey Massoni
*/

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class CarPayments
{
  public static void main( String [] args )
  {
    
    //instantiation
    Scanner scan = new Scanner( System.in );
    Random rand = new Random( );
    DecimalFormat money = new DecimalFormat( "$#.00" );
    DecimalFormat account = new DecimalFormat( "00000" );
    
    
    //greeting
    System.out.println( "Welcome to JJ's Credit! Let's get started." );
    
   
    //input
    System.out.println( "\nPlease enter your first and last name." );
    String name = scan.nextLine ();
    
    System.out.println( "\nOk, now what's the cost of your car?" );
    double cost = scan.nextDouble ();
    
    System.out.println( "\nWhat will your down payment be?" );
    double down = scan.nextDouble ();
    
    System.out.println( "\nHow many years will you be financing the car?" );
    double years = scan.nextDouble ();
    
    System.out.println( "\nAnd, finally, what will you annual interest rate be?" );
    double interest = scan.nextDouble ();
    
    
    //conversions
    double interestAdj = interest * .01;
    double monthly = interestAdj / 12;
    double months = years * 12;
    double financed = cost - down;
    
    
    //calculation
    double payment = ( monthly * financed ) / ( 1 - Math.pow ( 1 + monthly , -months ) );
    
   
    //account setup
    int number = rand.nextInt( 9001 ) + 1000;
    int indexOfSpace = name.indexOf ( " " );
    String last = name.substring( indexOfSpace + 1, indexOfSpace + 2 );
    
    
    //output
    System.out.println( "\nYour monthly payment will be " + money.format (payment) + "." );
    System.out.println( "Your account number is " + last + account.format (number) + "." );
     
  }
} 