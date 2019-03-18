/** GradeClient 
  * your name here
*/

public class GradeClient
{
  public static void main( String [] args )
  {
    /***** 1. Instantiate a Grade object named g1 using the default constructor */
   
   Grade g1 = new Grade();
    
    /***** 2. Output the grade */
   System.out.println( g1.getGrade( ) );
     
    /***** 3. Instantiate another Grade object named g2 with a numeric grade of 85 */
   Grade g2 = new Grade ( 85 );
    
   /***** 4. Output the g2 grade */
    
   System.out.println( g2.getGrade () ); 
   
   /**** 5. Output the g2 letter grade */ 
   System.out.println( g2.letterGrade( ) );
    
   /**** 6. Attempt to change the g2 grade to 101 and output the grade. */
   g2.setGrade( 100 );
   System.out.println( g2.getGrade( ) );
 
 
   System.out.println( "\ng1 is " + g1.toString() );
   System.out.println( "\ng2 is " + g2 );
    
  } // end main
} // end class