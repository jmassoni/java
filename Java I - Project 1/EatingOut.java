/* Tip and Tax Calculator
   Joey Massoni */

import java.util.Scanner;
import java.text.DecimalFormat;

public class EatingOut
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner( System.in );
    DecimalFormat money = new DecimalFormat( "$#.00" );
       
     System.out.println( "\nHope you had a great meal! Let's get started." );
     
     System.out.println( "\nHow much did your bill come out to?" );
     double bill = scan.nextDouble ();
     
     System.out.println( "\nDo you need to add in tax?" );
     String tax = scan.next ();
     
         if (tax.equals ("yes") )
         {
            System.out.println( "\nWhat's the tax rate?" );
            double taxRate = scan.nextDouble ();
            double taxConvert = 1 + (taxRate / 100);
            double taxTotal = bill * taxConvert;
   
            double badTip = taxTotal * .05;
            double goodTip = taxTotal * .15;
            double greatTip = taxTotal * .18;
            double outstandingTip = taxTotal * .2;
     
            double badTotal = taxTotal + badTip;
            double goodTotal = taxTotal + goodTip;
            double greatTotal = taxTotal + greatTip;
            double outstandingTotal = taxTotal + outstandingTip;
         
            System.out.println( "\nHow was the service? Type 1 for bad, 2 for good, 3 for great or 4 for outstanding!" );
            int service = scan.nextInt ();
         
               
               if (service == 1 ) 
               {
                  System.out.println( "\nYour tip should be " + money.format ( badTip ) + "." );
                  System.out.println( "Your total will be " + money.format ( badTotal ) + "." );
               } 
               else if (service == 2 ) 
               {  
                  System.out.println( "\nYour tip should be " + money.format ( goodTip ) + "." );
                  System.out.println( "Your total will be " + money.format ( goodTotal ) + "." );
               } 
               else if (service == 3 ) 
               {  
                  System.out.println( "\nYour tip should be " + money.format ( greatTip ) + "." );
                  System.out.println( "Your total will be " + money.format ( greatTotal ) + "." );
               }
               else if (service == 4 ) 
               {  
                  System.out.println( "\nYour tip should be " + money.format ( outstandingTip ) + "." );
                  System.out.println( "Your total will be " + money.format ( outstandingTotal ) + "." );
               }
               else
               {
                  System.out.println( "\nOk, that wasn't an option. Just figure it out yourself.");
               }
         }

         else
         {
     
            System.out.println( "\nHow was the service? Type 1 for bad, 2 for good, 3 for great or 4 for outstanding!" );
            int service = scan.nextInt ();
     
            double badTip = bill * .05;
            double goodTip = bill * .15;
            double greatTip = bill * .18;
            double outstandingTip = bill * .2;
     
            double badTotal = bill + badTip;
            double goodTotal = bill + goodTip;
            double greatTotal = bill + greatTip;
            double outstandingTotal = bill + outstandingTip;
     
      
            if (service == 1 ) 
            {
               System.out.println( "\nYour tip should be " + money.format ( badTip ) + "." );
               System.out.println( "Your total will be " + money.format ( badTotal ) + "." );
            } 
            else if (service == 2 ) 
            {  
               System.out.println( "\nYour tip should be " + money.format ( goodTip ) + "." );
               System.out.println( "Your total will be " + money.format ( goodTotal ) + "." );
            } 
            else if (service == 3 ) 
            {  
               System.out.println( "\nYour tip should be " + money.format ( greatTip ) + "." );
               System.out.println( "Your total will be " + money.format ( greatTotal ) + "." );
            }
            else if (service == 4 ) 
            {  
               System.out.println( "\nYour tip should be " + money.format ( outstandingTip ) + "." );
               System.out.println( "Your total will be " + money.format ( outstandingTotal ) + "." );
            }
            else
            {
               System.out.println( "\nOk, that wasn't an option. Just figure it out yourself.");
            }

         }   
 
   }
}