import java.util.Random;
import java.util.Arrays;

public class Sorter {


   public static void populate(int[] arr) {
     
      Random r = new Random();
      for(int i = 0; i < arr.length; i++){
         
         int x = r.nextInt();
         arr[i] = x;
         
      }
     
   }

   public static void insertionSort(int[] arr) {
   
	      for(int i = 1; i < arr.length; i++){
		      
            int temp = arr[i];
		      int pos = i;
		      
		      while(pos > 0 && arr[pos - 1] > temp){
			   
            arr[pos] = arr[pos - 1];
			   pos--;
            
		      } 
		      
            arr[pos] = temp;
	      } 
   }
   
   public static void main(String[] args) {
      
      
      
      int[] array = new int[100000];
      populate(array);
      long startTime = System.nanoTime();
      insertionSort(array);
      long endTime = System.nanoTime();
      String s = Arrays.toString(array);
      //System.out.println(s);
      
      long time = endTime - startTime;
      double trueTime = time / 1000000000.0;
      System.out.println("Insertion sort time: " + trueTime + ".");
      
   }

}