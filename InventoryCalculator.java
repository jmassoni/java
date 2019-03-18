import java.util.Scanner;

public class InventoryCalculator {
   
   public static void main(String[] args) {
     
      //instantiation
      Scanner scan = new Scanner(System.in);
     
      Item firstItem = new Item();
      Item secondItem = new Item();
      
      //first item
      System.out.println("Item 1");
      System.out.println("Enter the item name:");  
      String itemName = scan.nextLine();
      firstItem.setName(itemName);
      
      System.out.println("Enter the item price:");  
      int itemPrice = scan.nextInt();
      firstItem.setPrice(itemPrice);
      
      System.out.println("Enter the item quantity:");  
      int itemQuantity = scan.nextInt();
      firstItem.setQuantity(itemQuantity);
      scan.nextLine();

      //second item
      System.out.println("\nItem 2");
      System.out.println("Enter the item name:");  
      itemName = scan.nextLine();
      secondItem.setName(itemName);
      
      System.out.println("Enter the item price:");  
      itemPrice = scan.nextInt();
      secondItem.setPrice(itemPrice);
      
      System.out.println("Enter the item quantity:");  
      itemQuantity = scan.nextInt();
      secondItem.setQuantity(itemQuantity);
            
      
      //calculation
      int a = firstItem.getQuantity()*firstItem.getPrice();
      int b = secondItem.getQuantity()*secondItem.getPrice();
      int c = a + b;
      
      //output
      System.out.println("\nTOTAL COST");
      System.out.println( firstItem.getName() + " " + firstItem.getQuantity() +
                              " @ $" + firstItem.getPrice() + " = $" + a);
      System.out.println( secondItem.getName() + " " + secondItem.getQuantity() +
                              " @ $" + secondItem.getPrice() + " = $" + b);
                              
      System.out.println("\nTotal: $" + c );
   }
}

