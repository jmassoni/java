public class Recursion {
   public static int countBunnyEars(int numBunnies) {
      
      int count = 0;
      
      if(numBunnies == 0){
        
         return 0; 
         
      }
      
      else {
      
         count += 2;
         count += countBunnyEars(numBunnies-1);
                  
        
      }
      
      return count;  
   }

   public static void main(String[] args) {
      int bunnies = 4;
      int ears = countBunnyEars(bunnies);
      System.out.println(bunnies + " bunnies have " + ears + " ears.");
   } 
}