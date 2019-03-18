public class Week3 {
   /**
      method which calculates if 1 number is evenly divisible by another
      @param num1 integer to be divided
      @param num2 integer which divides num1
      @return true if num2 evenly divides num1
   **/
   public static boolean evenlyDivisible(int num1,int num2) {
       if (num1 % num2 == 0) {
         return true;
       } else {
          return false;
       }
   }
 /**
      sums up integers values between parameters
      
      @param a integer value included in sum, can be larger or smaller than b
      @param b integer value included in sum, can be larger or smaller than a
      @return the sum calculated
   **/
   public static int sumRange(int a, int b) {
      int sum = 0;
      if( a < b ) {
         for(int i = a; i <= b; i++) {
            sum += i;
         }
      } else {
         for(int i = b; i <= a; i++) {
            sum += i;
         }
      }
      return sum;
   }
   
   /**
      calculates the sum of integer from 0 to the parameter
   
      @param c the integer to sum to (inclusive)
      @return the sum calculated
   **/
   public static int sumRange(int c) {
      int sum = 0;
      for(int i = 0; i <= c; i++) {
         sum+=i;
      }
      return sum;
   }

   public static void main(String[] args) {
      System.out.println("Week 3");
      boolean b; 
      //System.out.println( evenlyDivisible(15, 3) );
      
      //System.out.println( sumRange(5, 2) );
      //System.out.println( sumRange(3) );
      
      b = evenlyDivisible(5, 2);
      //b = evenlyDivisible(6, 2);
      //b = b && false;
      //System.out.println( b );
   }
}