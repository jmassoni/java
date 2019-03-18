/** Dealership 
   client of the Auto class **/

public class Dealership
{
   public static void main( String [] args )
   {
   
      Auto defaultAuto = new Auto();
      System.out.println( "The model of the default Auto is "
            + defaultAuto.getModel() );
      System.out.println( "The miles driven is "
            + defaultAuto.getMilesDriven() );
      System.out.println( "The gallons of gas used is "
            + defaultAuto.getGallonsOfGas() );

      
      Auto hybrid  = new Auto ( "Prius ", 500, 10 );
      System.out.println( "\nThe model of the default Auto is "
            + hybrid.getModel() );
      System.out.println( "The miles driven is "
            + hybrid.getMilesDriven() );
      System.out.println( "The gallons of gas used is "
            + hybrid.getGallonsOfGas() );
            
      defaultAuto.setModel( "Nissan " );
      defaultAuto.setMilesDriven( 100000 );
      defaultAuto.setGallonsOfGas( 4000.0 );
      
      System.out.println( defaultAuto.getModel( ) + " "
               + defaultAuto.getMilesDriven( ) + " "
               + defaultAuto.getGallonsOfGas( ) );
               
      Auto clunker = new Auto( "clunker", -1, -2 );
      
      System.out.println( clunker.getModel( ) + " "
               + clunker.getMilesDriven( ) + " "
               + clunker.getGallonsOfGas( ) );
               
      System.out.println( "The MPG for " + defaultAuto.getModel( )
                           + " is " + defaultAuto.calculateMilesPerGallon( ) );
      System.out.println( "The MPG for " + hybrid.getModel( )
                           + " is " + hybrid.calculateMilesPerGallon( ) );
      System.out.println( "The MPG for " + clunker.getModel( )
                           + " is " + clunker.calculateMilesPerGallon( ) );   
                           
                           
      System.out.println( "\n" + defaultAuto );
      System.out.println( hybrid ); 
      System.out.println( clunker );                   
   }

   
} //end class   