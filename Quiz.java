public class Quiz {
   public static boolean anySevens(int i) {
      int digit = i%10;
      if(digit == 7)  //small bit of work we do to look at 1 number
         return true;
      else if(i == 0) {  //base case
         return false;
      }
      else {  //recursive call with smaller problem
         i = i / 10;
         return anySevens(i);
      }
   }

   public static void main(String[] args) {
      System.out.println( anySevens(10) );
      System.out.println( anySevens(17) );
      System.out.println( anySevens(2171712) );
      System.out.println( anySevens(71) );
   }

}