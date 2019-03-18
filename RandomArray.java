/*

Joey Massoni
jmassoni
On my honor, I have not given, nor received, 
nor witnessed any unauthorized assistance on this work.
I worked on this homework with Emmanuel Lopez and Maximiliano Castrillon.

*/

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class RandomArray {
   
   //Instance Variable
   /**
   * Instantiates an array of integer numbers called arr.
   **/
   private int[] arr;
   
   
   //Constructor
   /**
   * Default Constructor initializing
   * arr to have n number of indices.
   * @param n constitutes number of indices.
   **/
   public RandomArray(int n) {
      
      arr = new int[n];     
            
   }
   
   /**
   * Retrieves array instantiated
   * as an instance variable.
   * @return array named arr.
   **/
   public int[] getArray(){
   
     return arr;
     
   }
   
   /**
   * Populates array with random
   * numbers.
   **/
   public void populate() {
     
      Random r = new Random();
      for(int i = 0; i < arr.length; i++){
         
         int x = r.nextInt();
         arr[i] = x;
         
      }
   }   
   
   /**
   * Searches through array
   * using binary algorithm.
   * @param number receives number
   * to search for that's set in main.
   **/   
   public int binarySearch(int number){
   
      int mid = 0;
      int low = 0;
      int high = 0;
      
      high = number - 1;
      
      while (high >= low) {
         mid = (high + low) / 2;
         if (arr[mid] < number) {
            low = mid + 1;
         } 
         else if (arr[mid] > number) {
            high = mid - 1;
         } 
         else {
            return mid;
         }
      }
      
      return -1;
   }
   
  
   /**
   * Helper method searches through array
   * using recursive binary algorithm.
   **/
   private void recursiveBinarySearchHelper() {
   
      
   }
   
   /**
   * Search method receives number and sends to
   * helper method.
   * @param number receives number to search for
   * that's set in main.
   **/
   public void recursiveBinarySearch(int number) {
      
      
      
   }
   
   
   /**
   * Sorts integers in arr 
   * using insertion sort algorithm.
   **/
   public void insertionSort() {
   
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
   
   /**
   * Sorts integers in arr 
   * using selection sort algorithm.
   **/
   public void selectionSort() {
      
      int i = 0;
      int n = 0;
      int smallest = 0;
      int temp = 0;

      for (i = 0; i < arr.length; ++i) {

         smallest = i;
         for (n = i + 1; n < arr.length; n++) {

            if (arr[n] < arr[smallest]) {
               smallest = n;
            }
         }

         temp = arr[i];
         arr[i] = arr[smallest];
         arr[smallest] = temp;
      }
      
   }
   
   /**
   * Helper method that sorts integers 
   * in array using quicksort algorithm.
   **/
   private int quickHelper(int array [], int i, int n) {
      
      int low = 0;
      int hi = 0;
      int mid = 0;
      int pivot = 0;
      int temp = 0;
      boolean done = false;

      
      mid = i + (n - i) / 2;
      pivot = array[mid];

      low = i;
      hi = n;

      while (!done) {

         
         while (array[low] < pivot) {
            low++;
         }

         
         while (pivot < array[hi]) {
            hi--;
         }

         
         if (low >= hi) {
            done = true;
         } else {
            
            temp = array[low];
            array[low] = array[hi];
            array[hi] = temp;

            low++;
            hi--;
         }
      }

      return hi;
      
   }
   
   
   /**
   * Helper method receives data
   * from quickSort method and runs  
   * recursively to sort integers in array.
   **/
   private void quickHelperRec(int array [], int i, int n) {
   
      int x = 0;

      
      if (i >= n) {
         return;
      }

      x = quickHelper(array, i, n);

      quickHelperRec(array, i, x);
      quickHelperRec(array, x + 1, n);

      return;
         
   }
   
   /**
   * Sorts integers in arr 
   * using quicksort algorithm.
   **/
   public void quickSort() {
      
      int i = 0;
      int n = arr.length - 1;
      
      quickHelperRec(arr, i, n);
   }
   
   /**
   * Helper method that sorts integers 
   * in array using mergesort algorithm.
   **/
   private void mergeHelper(int array [], int i, int x, int n) {

      int size = n - i + 1;       
      int numbers [] = new int[size]; 
      int merge = 0;                 
      int left = 0;                  
      int right = 0;                 

      left = i;                      
      right = x + 1;                 
      
      while (left <= x && right <= n) {
         if (array[left] < array[right]) {
            numbers[merge] = arr[left];
            left++;
         } 
         else {
            numbers[merge] = array[right];
            right++;
         }
         merge++;
      }
     
      while (left <= x) {
         numbers[merge] = array[left];
         left++;
         merge++;
      }

      while (right <= n) {
         numbers[merge] = array[right];
         right++;
         merge++;
      }

      for (merge = 0; merge < size; merge++) {
         array[i + merge] = numbers[merge];
      }
   }
   
   /**
   * Helper method receives data
   * from mergeSort method and runs  
   * recursively to sort integers in array.
   **/
   private void mergeHelperRec(int array [], int i, int n) {
   
      int x = 0;
      
      if (i < n) {
         x = (i + n) / 2;  
         
         mergeHelperRec(array, i, x);
         mergeHelperRec(array, x + 1, n);

         mergeHelper(array, i, x, n);
         
      }
      
   }
   
   /**
   * Sorts integers in arr 
   * using mergesort algorithm.
   **/
   public void mergeSort() {
      
      int i = 0;
      int n = arr.length - 1;
      
      mergeHelperRec(arr, i, n);
      
   }

}