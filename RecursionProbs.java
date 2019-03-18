public class RecursionProbs {
 
   public static int sumDigits( int num ) {
      if( num == 0 ) {  //base case
         return num;
      }
      int digit = num % 10;
      int smallerProb = num / 10;
      int result =  sumDigits( smallerProb );
      return result + digit;
      //return num%10 + sumDigits( num/10 );
   }
   
   public static int countY(String s) {
      if( s.equals("") ) {  //base case
         return 0;
      }
      
      String smallerProb = s.substring( 1 );
      int result = countY( smallerProb );
      if ( s.charAt(0) == 'y'  ) {
         result += 1;
      } else {
         result += 0;
      }
      return result;
   }

      
   public static void main(String[] args) {
      System.out.println( countY("yyyy"));
   }  
 }
