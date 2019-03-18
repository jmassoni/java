/*

Joey Massoni
Compares sort times for Insertion, Selection, Quicksort and Mergesort
algorithms with arrays ranging in size from 1,000-100,000.

*/


import java.util.Random;
import java.util.Arrays;

public class SortAnalyzer {

   
   public static void main(String[] args) {
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(1000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.insertionSort();
         long endTime = System.nanoTime();
         
         
         long time = endTime - startTime;
         double trueTime = time / 10000000.0;
         trueTime += trueTime;
         
                 
         if(i == 9) {
            
            System.out.println("Insertion sort time for 1000: " + trueTime + ".");      
         
         }
      } 
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(10000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.insertionSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 100000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Insertion sort time for 10,000: " + trueTime + ".");     
         
         }      
      
      }
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(100000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.insertionSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 1000000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Insertion sort time for 100,000: " + trueTime + ".");     
         
         }      
      
      }      
      
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(1000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.selectionSort();
         long endTime = System.nanoTime();
         
         
         long time = endTime - startTime;
         double trueTime = time / 10000000.0;
         trueTime += trueTime;
         
                 
         if(i == 9) {
            
            System.out.println("\nSelection sort time for 1000: " + trueTime + ".");      
         
         }
      } 
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(10000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.selectionSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 100000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Selection sort time for 10,000: " + trueTime + ".");     
         
         }      
      
      }
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(100000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.selectionSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 1000000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Selection sort time for 100,000: " + trueTime + ".");     
         
         }      
      
      }
     
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(1000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.quickSort();
         long endTime = System.nanoTime();
         
         
         long time = endTime - startTime;
         double trueTime = time / 10000000.0;
         trueTime += trueTime;
         
                 
         if(i == 9) {
            
            System.out.println("\nQuicksort time for 1000: " + trueTime + ".");      
         
         }
      } 
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(10000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.quickSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 100000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Quicksort time for 10,000: " + trueTime + ".");     
         
         }      
      
      }
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(100000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.quickSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 1000000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Quicksort time for 100,000: " + trueTime + ".");     
         
         }      
      
      }      
      
      
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(1000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.mergeSort();
         long endTime = System.nanoTime();
         
         
         long time = endTime - startTime;
         double trueTime = time / 10000000.0;
         trueTime += trueTime;
         
                 
         if(i == 9) {
            
            System.out.println("\nMergesort time for 1000: " + trueTime + ".");      
         
         }
      } 
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(10000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.mergeSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 100000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Mergesoft time for 10,000: " + trueTime + ".");     
         
         }      
      
      }
      
      for (int i = 0; i <= 9; i++) {
           
         RandomArray array = new RandomArray(100000);
         array.populate();
         
         long startTime = System.nanoTime();
         array.mergeSort();
         long endTime = System.nanoTime();
            
         
         long time = endTime - startTime;
         double trueTime = time / 1000000000.0;
         trueTime += trueTime;
         
         
         if(i == 9) {

            System.out.println("Mergesort time for 100,000: " + trueTime + ".");     
         
         }      
      
      }
      
      
   }

}