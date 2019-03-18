import java.util.Scanner;

public class CountTriples {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = scan.next();
      
      
      System.out.println("You entered " + s + " and " + num);
      int count = 0;
      
      
      for ( int i = 0; i < s.length() - num; i++) {
         System.out.print( s.charAt(i) );
         for( int k = i+1; k < i+num; k++ ) {
            System.out.println( s.charAt(k) );
            }
         }
         System.out.println( );
         
   
   }
   
}