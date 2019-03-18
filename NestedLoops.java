public class NestedLoops {
   public static void main (String [] args) {
      int numRows = 2;
      int numCols = 3;

      // Note: You'll need to define more variables

      /* Your solution goes here  */
      
      
      
      
      for(int rows = 1;  rows <= numRows; rows++){
         
         char letter = 'A';
         
         for(int cols = 1; cols <= numCols; cols++){
            
            System.out.print(rows);
       
            System.out.print(letter + " ");            
            
            letter++;           
         
         }
                   
      }
         
            
      
      System.out.println("");

      return;
   }
}