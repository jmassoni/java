import java.util.ArrayList;

public class QueueArray {
   //class which implements a queue data structure
   //with a primitive array

   private ArrayList<Integer> queue;
   private int front; //keeps track of front of queue
   private int back;  //keeps track of next empty space

   public QueueArray() {
      front = 0;
      back = 0; 
      queue = new ArrayList<Integer>();
   }
   
   public boolean isEmpty() {
      return front == back;
   }  
   
   public int peek() {
      return queue.get(front);
   }
   
   public void push(int num) {
      queue.add(num);
      back++;
   }
   
   public int pop() {
      if (!isEmpty()) {
         int num = queue.get(front);
         front++;
         return num; 
      }
            return 0;
   }

   public int size() {
      if (front == back) {
         return 0;
      } else {
         return back-front;
      }
      
   }
   
   public String toString() {
      
      String s = "";
      for(int i = front; i < back; i++){
         s += queue.get(i);
         s += " ";
      }
      
      return s;
      
   }

}

