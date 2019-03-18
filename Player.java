public class Player {
   
   //instance variables
   private int jerseyNum;
   private int playerRating;

   /**
      Constructs a Player object

      @param num The players jersey number (0-99)
      @param rating The players current rating (0-9)
   **/
   public Player(int num, int rating) {
      jerseyNum = num;
      playerRating = rating;
   }

   /**
      returns a players current rating

      @return a player rating (0-9)
   **/
   public int getRating() {
      return playerRating;
   }	
}