import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ReadNums {
   public static void main(String[] args)throws IOException {
      //read nums in from RandomNums.txt
      //count frequency of each number (0-19) 
   
      FileInputStream fileByteStream = new FileInputStream("RandomNums.txt");
      Scanner input = new Scanner(fileByteStream);  
      
     
      ArrayList<Integer> arrayList = new ArrayList<Integer>();
      
      for(int i = 0; i < 20; i++) {
         arrayList.add(0);
      }
      
      for(Integer num : arrayList) {
         System.out.print(num + " ");
      }
      
      //for(int i = 0; i < arrayList.size(); i++) {
      //   Integer num = arrayList.get(i);
      //}
      
      while(input.hasNextInt()) {
         int index = input.nextInt();
         
         //arrayList.set(index, arrayList.get(index)+1 );
         int current = arrayList.get(index);
         int newVal = current + 1;
         arrayList.set(index, newVal);
      }
      System.out.println(arrayList.size());
      int i = 0;         
      for(Integer num : arrayList) {
         System.out.println("Number of " + i + "'s: " + num +
            "(" + ((double)num/250000*100.0) + "%)");
         i++;
      }
        
   }
}