/**  Lab 8 
    Joey Massoni  */


import java.util.*;
import java.io.*;

public class lab8
{
  public static void main( String [] args ) throws IOException
  {
      final int NUMBER_OF_BOY_NAMES = 500;
      final int NUMBER_OF_GIRL_NAMES = 500;
      
      String [] boys = new String[NUMBER_OF_BOY_NAMES];
      String [] girls = new String[NUMBER_OF_GIRL_NAMES];
      
      Scanner one = new Scanner( new File( "boynames2015.txt" ) );
      Scanner two = new Scanner( new File( "girlnames2015.txt" ) );
      

      
      for ( int i = 0; i < boys.length; i++ )
      {
         boys[i] = one.nextLine();
         
         if (i < 11 && i != 0)
         {
         System.out.print( boys[i] + ", " );
         }
         
         if (i == 0)
         {
         System.out.println( "\nThe most popular girl name is " + boys[i] );
         }

      }
      
      for ( int i = 0; i < girls.length; i++ )
      {
         girls[i] = two.nextLine();
         if (i < 11 && i != 0)
         {
         System.out.print( girls[i] + ", " );
         }
         
         if (i == 0)
         {
         System.out.println( "\nThe most popular girl name is " + girls[i] );
         }
      }
     
      Scanner scan = new Scanner( System.in );
      System.out.println( "\nEnter a name." );
      String name = scan.nextLine();
      
      
      int data = -1;
      int data2 = -1;
      
      for ( int i = 0; i < boys.length; i++ )
      {
         if ( name.equalsIgnoreCase( boys[i] ) )
         {
            data = i;
         }  
      }   
      if ( data == -1 )
      {
         System.out.println( "This name is not on the boy's list." );
      }
      else
      {
         System.out.println( name + " ranks at number " + ( data + 1 ) + " on the boy's name list." );
      }  
      
      for ( int i = 0; i < girls.length; i++ )
      {
         if ( name.equalsIgnoreCase( girls[i] ) )
         {
            data2 = i;
         }  
      }   
      if ( data2 == -1 )
      {
         System.out.println( "This name is not on the girl's list." );
      }
      else
      {
         System.out.println( name + " ranks at number " + ( data2 + 1 ) + " on the girl's name list." );
      }
    
     
                      
  } // end of main
  
} // end of class