public class CreditCard {
   //instance variables
   private int num;
   private String name;
   private String expiration;
   private int cvv;
   private int limit;
   
   public CreditCard() {
      this.expiration = "Feb2018";
      this.limit = 200;
   }
   
   public CreditCard(String name) {
      this.name = name;
      this.expiration = "Feb2020";
      this.limit = 250;
   }
   
   public String getName() {
      return name;
   }
   
   public int getLimit() {
      return limit;
   }
   
   public void setLimit( int limit ) {
      this.limit = limit;
   }
   
   public void setName( String n ) {
      name = n;
   }
   
   public String toString() {
      return name + " has a $" + limit + " limit."; 
   }
}