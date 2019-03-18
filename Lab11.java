public class Lab11 {
   public static final int BLUEBERRY = 0;
   public static final int CHOCOLATE = 1;
   public static final int COLA = 2;
   public static final int GRAPE = 3;
   public static final int GREENAPPLE = 4;
   public static final int LEMON = 5;
   public static final int ORANGE = 6;
   public static final int RASPBERRY = 7;
   public static final int WATERMELON = 8;
                     
   public static QueueArray eatCandy(QueueArray pez, int day) {
      
      if(day > 4 || day < 0){
      
         throw new IllegalArgumentException("error msg");
         
      }
      
      QueueArray queue = new QueueArray();
      int counter = 0;
      
      
      while (!pez.isEmpty()) {
         
         int temp = pez.pop();
         
         if (counter%(day+1) == 0){
            queue.push(temp);
         } else {
            pez.push(temp);
         }
         counter++;
      }
      
      return queue;
   }
   
   
   
   
   
   public static void main(String[] args) {
      QueueArray pez = new QueueArray();
      pez.push(BLUEBERRY); 
      pez.push(CHOCOLATE);
      pez.push(COLA);
      pez.push(GRAPE);
      pez.push(GREENAPPLE);
      pez.push(LEMON);
      QueueArray eaten = eatCandy(pez, 0); //Monday
      System.out.println(eaten);
   }
}