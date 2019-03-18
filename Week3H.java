public class Week3H {
  /**
      method which calculates if 1 number is evenly divisible by another
      @param num1 integer to be divided
      @param num2 integer which divides num1
      @return true if num2 evenly divides num1
   **/
   public static boolean evenlyDivisible (int num1, int num2) {
      if(num1 % num2 == 0) {
         return true;
      } 
      return false;
   }
   
   /**
      sums up integers values between parameters
      
      @param a integer value included in sum, can be larger or smaller than b
      @param b integer value included in sum, can be larger or smaller than a
      @return the sum calculated
   **/
   public static int sumRange(int a, int b) {
      int sum = 0;
      int big = 0;
      int small = 0;
      
      if (a > b) {
         big = a;
         small = b;
      } else {
         big = b;
         small = a;
      }
      for(int i = small; i <= big; i++) {
         //System.out.println( i );
         sum += i;
      }
      return sum;
   }
   
   /**
      sums up integers from 0 to parameter
      
      @param c the integer to sum to (inclusive)
      @return the sum calculated
   **/
   public static int sumRange(int c) {
      int sum = 0;
      for(int i = 0; i <= c; i++) {
         //System.out.println( i );
         sum += i;
      } 
      return sum;
   }
 
   public static void main(String[] args) {
      System.out.println("Week 3");
      //boolean b = evenlyDivisible(15, 3);
      //System.out.println( b );
      int x = sumRange(5, 2);
      x = sumRange(6);
      //System.out.println(x);
   }
}