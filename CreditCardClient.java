public class CreditCardClient {
   public static void main(String[] args) {
      CreditCard visa = new CreditCard();
      CreditCard mc = new CreditCard( "Valerie Summet" );
      //System.out.println("visa num is: " + visa.num);  
      //visa.num = 12345;
      //System.out.println("visa num is: " + visa.num);
      
      visa.setName( "VS ");
      
      visa.setLimit( 1000 );
      mc.setLimit( 500 );
      
      System.out.println("visa: " + visa.getName() + " " + visa.getLimit());
      System.out.println("mc: " + mc.getName() + " " + mc.getLimit());
   }
}