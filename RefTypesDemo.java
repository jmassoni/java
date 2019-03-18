public class RefTypesDemo {
   public static void methodOne(int x) {
      x = x + 4;
   }
   
   public static void methodTwo(Pirate p) {
      p.loseALimb();
   }

   public static void main(String[] args) {
      //methods do not change values of variables!
      int y = 3;
      System.out.println("y before method: " + y);
      methodOne(y);
      System.out.println("y after method: " + y);
      
      //pay attention to how refernce variables (addresses)
      //are used in methods
      Pirate pete = new Pirate("Peg Leg Pete", 3);
      System.out.println("pete before method: " + pete.getLimbsRemaining());
      methodTwo(pete);
      System.out.println("pete after method: " + pete.getLimbsRemaining());
    
      //we're used to independent copies.
      //changes to x don't affect y and vice versa
      int y = 6;
      int x = y;
      System.out.println(x + " " + y);
      x--;
      System.out.println(x + " " + y);
      
      //aliases!  Not independent objects!
      Pirate pete = new Pirate("Peg Leg Pete", 3);
      Pirate bob = pete;
      System.out.println("pete: " + pete.getLimbsRemaining());
      System.out.println("bob: " + bob.getLimbsRemaining());
      bob.loseALimb();  // or pete.loseALimb();
      System.out.println("pete: " + pete.getLimbsRemaining());
      System.out.println("bob: " + bob.getLimbsRemaining());
      
      //indenpendent objects
      //we can now change bob w/o affecting pete and vice versa
      //note that we used the keyword new here but we didn't above.
      bob = new Pirate(pete.getName(), pete.getLimbsRemaining());
      
   }

}