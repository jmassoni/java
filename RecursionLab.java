public class RecursionLab {
   
   //write the static method starPair
   
   public static String starPair ( String s ){
      
      if( s.length() == 0 ) {  
         
         return "";
      
      }
      
      if( s.length() == 1 ) {
      
         return s;
      
      }
      
      String smaller = s.substring( 1 );
      String result = starPair( smaller );

      
      if (s.charAt(0) == s.charAt(1)){
        
         result = s.charAt(0) + "*" + result;

      }
      else {
      
         
         result = s.charAt(0) + result;
         
      }
      
      return result;
      
   }   

   //write the static method power
  
      
   public static int power ( int base, int exp ) {
      
      int result = 0;
      
      if ( exp == 0 ) {
      
         return 1;
      
      }
      else {
     
         --exp;
         result = power(base, exp);
         result *= base;
           
      }
      
      return result;
      
   }
   
   
 

   public static void main(String[] args) {
        System.out.println( starPair("testt") );
        System.out.println( power(3, 3) );
   }

}