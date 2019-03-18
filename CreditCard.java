/*

Joey Massoni
jmassoni
On my honor, I have not given, nor received, 
nor witnessed any unauthorized assistance on this work.
I worked on this homework with Emmanuel Lopez and Maximiliano Castrillon.

*/

public class CreditCard {
   
   
   //Instance Variables
   /**
   * Name of card holder.
   **/
   private String cardName;
  
   /**
   * Digits on card.
   **/
   private int cardNumber;
   
   
   //Constructors
   /**
   * Default Constructor initializing
   * all fields.
   **/
   public CreditCard() {
      
      cardName = "none";
      cardNumber = -1;
      
      }
   
   /**
   * Overloaded constructor initializing cardName and cardNumber
   * to values that are set in client.
   * @param cardName receives name on card from client.
   * @param cardNumber receives number on card from client.
   **/
   public CreditCard(String cardName, int cardNumber) {
      
      this.cardName = cardName;
      this.cardNumber = cardNumber;
      
      }     
      

   
   //Mutators
   /**
   * Sets name on credit card to String 
   * specified in client.
   * @param n receives String for name on card from client.
   **/
   
   public void setName(String n) {
      
      cardName = n;
      
      }
   
   /**
   * Retrieves name on credit card that
   * was set with setName.
   * @return value of cardName.
   **/
   public String getName() {
      
      return cardName;
      
      }
   
   
   /** Sets number on credit card to int 
   * specified in client.
   * @param n receives int for number on card from client.
   **/
   public void setNumber(int n) {
   
      cardNumber = n;
      
      }
      
   /**
   * Retrieves number on credit card that
   * was set with setNumber.
   * @return value of cardNumber.
   **/
   public int getNumber() {
      
      return cardNumber;
      
      }
      
   //Methods
   /**
   * Converts indicated variables to strings.
   * @return name on card followed by number on card.
   **/
   public String toString() {
   
      return cardName + ": " + cardNumber;
   
      }
   
   /**
   * Verifies that number on card entered in client consists of 8 digits.
   * @return true if 8 digits are entered, false otherwise.
   **/
   public boolean validLength() {
		
      int count = 0;
      int newCardNumber = getNumber();
      
      while(newCardNumber != 0) {
         
         int digit = newCardNumber % 10;
         newCardNumber = newCardNumber / 10;
         count++;
         
         }
      
      if ( count == 8 ) {
		
         return true;
		   
         }
		else {
			
         return false;
		
         }
	   
      }
   
   
   /**
   * Verifies that number on card entered in client 
   * is valid by using a variation of the Luhn-10 algorithm.
   * @return true if checksum mod 10 is 0, false otherwise.
   **/
   public boolean validCheckSum() {
	     
      int count = 0;
      int newCardNumber = getNumber();
      int sum = 0;
      int num1 = 0;
      int num2 = 0;
      
      
      if ( validLength() != true ) {
         
         return false;
         
         }
         
      while(newCardNumber != 0) {
         
         int digit = newCardNumber % 10;
         newCardNumber = newCardNumber / 10;
         count++;
         
         if ( count % 2 == 1){
         
            num1 += digit;
         
            }
            
         if ( count % 2 == 0) {
         
            num2 += digit*2;
         
            }
          
         }
         
         
      sum = num1 + num2;
      
      return true;
   }
   
}