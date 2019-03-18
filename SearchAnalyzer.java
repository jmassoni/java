/*

Joey Massoni
Compares search times for Binary and Recursive Binary Search
algorithms with arrays ranging in size from 1,000-100,000.

*/

import java.util.Random;
import java.util.Arrays;

public class SearchAnalyzer {

   
   public static void main(String[] args) {
         
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(1000);
         array.populate();
         array.insertionSort();
         
         long startTime1 = System.nanoTime();
         array.binarySearch(0);
         long endTime1 = System.nanoTime();
   
         long startTime2 = System.nanoTime();
         array.recursiveBinarySearch(0);
         long endTime2 = System.nanoTime();
         
         
         
         long time1 = endTime1 - startTime1;
         double trueTime1 = time1 / 10000000.0;
         trueTime1 += trueTime1;
         
         long time2 = endTime2 - startTime2;
         double trueTime2 = time2 / 10000000.0;
         trueTime2 += trueTime2;
         
         if(i == 9) {
            
            System.out.println("Binary search time for 1000: " + trueTime1 + ".");
            System.out.println("Recursive binary search time for 1000: " + trueTime2 + ".");      
         
         }
      } 
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(10000);
         array.populate();
         array.insertionSort();
         
         long startTime1 = System.nanoTime();
         array.binarySearch(0);
         long endTime1 = System.nanoTime();
   
         long startTime2 = System.nanoTime();
         array.recursiveBinarySearch(0);
         long endTime2 = System.nanoTime();
         
         
         
         long time1 = endTime1 - startTime1;
         double trueTime1 = time1 / 100000000.0;
         trueTime1 += trueTime1;
         
         long time2 = endTime2 - startTime2;
         double trueTime2 = time2 / 100000000.0;
         trueTime2 += trueTime2;
         
         if(i == 9) {

            System.out.println("\nBinary search time for 10,000: " + trueTime1 + ".");
            System.out.println("Recursive binary search time for 10,000: " + trueTime2 + ".");      
         
         }      
      
      }
      
     for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(100000);
         array.populate();
         array.insertionSort();

         
         long startTime1 = System.nanoTime();
         array.binarySearch(0);
         long endTime1 = System.nanoTime();
   
         long startTime2 = System.nanoTime();
         array.recursiveBinarySearch(0);
         long endTime2 = System.nanoTime();
   
        
         
         long time1 = endTime1 - startTime1;
         double trueTime1 = time1 / 1000000000.0;
         trueTime1 += trueTime1;
         
         long time2 = endTime2 - startTime2;
         double trueTime2 = time2 / 1000000000.0;
         trueTime2 += trueTime2;
         
         if(i == 9) {
            
            System.out.println("\nBinary search time for 100,000: " + trueTime1 + ".");
            System.out.println("Recursive binary search time for 100,000: " + trueTime2 + ".");      
         
         }      
      
      }   
   }

}