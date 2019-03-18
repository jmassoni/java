import java.util.Random;

public class TwoD {
   /** 
   method to fill a 2D array with random numbers (0-9)
   
   @param a the array to fill with random numbers
   **/
   public static void randomize(int[][] a) {
      Random random = new Random();
      for(int r = 0; r < a.length; r++) {
         for(int c = 0; c < a[r].length; c++) {
            a[r][c] = random.nextInt(10);
         }
      }    
   }

   /**
   printing a 2D array
   
   @param a the 2D array to display (row major order)
   **/
   public static void print2D(int[][] a) {
      for(int r = 0; r < a.length; r++) {
         for(int c = 0; c < a[r].length; c++) {
            System.out.print( a[r][c] + " " );
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      //initial values all 0
      int[][] x = new int[2][3];
      x[0][0] = -15;
      x[1][2] = 8;
      x[0][2]++;
            
      //ragged array with initial values
      int[][] y = {
         {1, 2, 3, 4}, 
         {5, 6, 7, 8}, 
         {9, 0, 11, 12, 13}
      };
      
      //note: values assigned to x and y are addresses!
      System.out.println(x);
      System.out.println(y);
      
      //display a 2d array the way we want
      print2D( y );      
      
      //array filled with random values
      int[][] z = new int[5][3];
      randomize(z);
      print2D(z);
   }
}