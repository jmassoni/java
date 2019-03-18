/*

Joey Massoni
jmassoni
On my honor, I have not given, nor received, 
nor witnessed any unauthorized assistance on this work.
I worked on this homework with Maximiliano Castrillon and Emmanuel Lopez.

*/


import java.io.*;
import java.util.Scanner;

public class Analyzer {
  
   /**
      method which extracts characters other than letters
      of the alphabet from a String.
      @param s a String that may or may have special characters
      or punctuation marks in it.
      @return test a String that is void of anything other than 
      letters.
   **/    
   public static String onlyAlpha(String s) {
         String test = new String();
         
         for(int i = 0; i <= s.length()-1; i++) {
            if(Character.isAlphabetic(s.charAt(i))){
              
               test += Character.toString(s.charAt(i));
               
            }
            
            
         }
         
         System.out.println(test);
         return test;
   }
   
   /**
      method which finds file with appropriate name and
      scnas it. It can also insert the words found in
      the appropriate file into a BST.
      @param fileName receives the user specified name 
      of the file.
      @return awesome a BST filled with data from a file.
   **/       
   public static BST readFile(String fileName) throws FileNotFoundException {
     File input = new File(fileName);
     Scanner in = new Scanner(input);
     
     BST awesome = new BST();
     
     while (in.hasNextLine()) {
         
          String s = in.nextLine();
          onlyAlpha(s);
          s = s.toLowerCase();
          
          
          awesome.insert(s);
                   
     }
     
     return awesome;
   }
   
//    public static int numWords(){
//       int n;
//       
//       return int n;
//       
//       
//    }
   
   
   /**
      method used to test other methods and receive user input.
   **/    
   public static void main(String[] args) throws IOException{
      Scanner scanner = new Scanner(System.in);
      System.out.print("\nEnter a file name: ");
      String fileName = scanner.next();
      
      
      try {
         readFile(fileName).inOrder();
         
      }
      catch(FileNotFoundException exception)
      {
      System.out.println("The file " + fileName + " was not found.");
      }          
      
   }
}