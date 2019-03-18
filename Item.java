public class Item {
   
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   private int inventoryNumber = numItems + 1;
   
   private static int numItems;


   public Item() {
      
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
      numItems++;
      
   }
 
   public Item(String itemName, int itemPrice, int itemQuantity) {
      
      this.itemName = itemName;
      this.itemPrice = itemPrice;
      this.itemQuantity = itemQuantity;
      numItems++;
      
   }

   //new stuff
   public static int getNumItems() {
      
      return numItems;
      
   }
   
   public int getInventoryNumber() {
   
      return inventoryNumber;
      
   }
   
   
   //pld stuff
   public void setName(String n) {
     itemName = n;
   }
   
   public String getName() {
      return itemName;
   }
   
   public void setPrice(int n) {
      itemPrice = n;
   }
   
   public int getPrice() {
      return itemPrice;
   }
   
   /**
   * This method takes the user defined quantity
   * and sets it to the variable itemQuantity.
   * @param n is used to receive the input
   * and relate it to itemQuantity.
   */
   public void setQuantity(int n) {
      itemQuantity = n;
   }
   
   /**
   * This method takes allows InventoryCalculator
   * to utilize the value set using setQuantity.
   * @return the int itemQuantity is returned to
   * InventoryCalculator.
   */
   
   public int getQuantity() {
      return itemQuantity;
   }
   
   
}