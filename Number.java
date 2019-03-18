/*

Joey Massoni
jmassoni
On my honor, I have not given, nor received, 
nor witnessed any unauthorized assistance on this work.


*/


public class Number {
   
   //Instance Variables
   /**
   * Initial value (base 10).
   **/
   private int decimalVal;
   
   /**
   * Initial value converted to binary (base 2).
   **/
   static String binaryVal = "";
   /**
   * Initial value converted to binary (base 8).
   **/
   static String octalVal = "";
   /**
   * Initial value converted to binary (base 16).
   **/
   static String hexadecimalVal = "";
   
   
   //Constructor
   /**
   * Default Constructor initializing
   * all fields.
   * @param n receives initial decimal number.
   **/
   public Number(int n) {
      
      if ( n <= 0 ){
         
         decimalVal = 0;
         
      }
      else {
         
         decimalVal = n;
         
      }
      
   }

   
   
   //Setter and Getter for Decimal
   
   /**
   * Allows the decimal value to be changed.
   * @param n receives input to set decimal value.
   **/
   public void setDecimal(int n) {
      
      if ( n <= 0 ){
         
         decimalVal = 0;
         
      }
      else {
         
         decimalVal = n;
         
      }
      
   }
   
   /**
   * Allows decimal value to be retrieved.
   * @return variable initially set using constructor.
   **/
   public int getDecimal() {

      return decimalVal;
   
   } 
   
      
   /**
   * Converts decimal number to binary.
   * @param n receives decimal value to be converted.
   * @return modified binary value.
   **/
   public static String toBinary(int n) {
      
           
      if(n == 0){
        
         return "";
         
      }
      else{
        
         toBinary(n/2);
         System.out.print( n%2 + " ");
         
         
        
      } 
      
     return binaryVal;
      
   }
   
   /**
   * Converts decimal number to octal.
   * @param n receives decimal value to be converted.
   * @return modified octal value.
   **/
   public static String toOctal(int n) {
   
      if(n == 0){
        
         return "";
         
      }
      else{
        
         toOctal(n/8);
         System.out.print( n%8 + " ");
         
         
        
      } 
      
      return octalVal;
      
   }
   
   /**
   * Converts decimal number to hexadecimal.
   * @param n receives decimal value to be converted.
   * @return modified hexadecimal value.
   **/
   public static String toHexadecimal(int n) {
   
      if(n == 0){
        
         return "";
         
      }
      else{
        
         toHexadecimal(n/16);
         if(n % 16 == 10) {
         System.out.print("A" + " ");
         }
         else if(n % 16 == 11) {
         System.out.print("B" + " ");
         } 
         else if(n % 16 == 12) {
         System.out.print("C" + " ");
         }   
         else if(n % 16 == 13) {
         System.out.print("D" + " ");
         }
         else if(n % 16 == 14) {
         System.out.print("E" + " ");
         }
         else if(n % 16 == 15) {
         System.out.print("F" + " ");
         }
         else {
         
         System.out.print( n%16 + " ");
         
         }
              
        
      } 
      
      return hexadecimalVal;
   
   }
   
   
   
   
   
   //Binary Getter
   /**
   * Allows binary value to be retrieved.
   * @return binary value modified by toBinary method.
   **/
   public String getBinary() {

      return binaryVal = toBinary(decimalVal);
      
   
   }
   
   //Octal Getter
   /**
   * Allows octal value to be retrieved.
   * @return octal value modified by toOctal method.
   **/
   public String getOctal() {

      return octalVal = toOctal(decimalVal);
   
   }
   
   //Hexadecimal Getter
   /**
   * Allows hexadecimal value to be retrieved.
   * @return hexadecimal value modified by toHexadecimal method.
   **/
   public String getHexadecimal() {

      return hexadecimalVal = toHexadecimal(decimalVal);
   
   }
   
   //toString
   /**
   * Returns a string with appropriate words and values.
   * @return multiple strings and values that have been set or converted.
   **/

   public String toString() {
   
      return "Number Value: " + decimalVal +
             "\n\tBinary Representation: " + getBinary() +
             "\n\tOctal representation: " + getOctal() +
             "\n\tHexadecimal representation: " + getHexadecimal();               
   
   }
   
   
   
   
   public static void main (String[] args) 
      {
          
          Number n = new Number(26);
          System.out.println(n.getBinary());
          System.out.println(n.getOctal());
          System.out.println(n.getHexadecimal());   
          
         
      }   
   
   
   
}