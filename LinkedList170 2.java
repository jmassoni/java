// Remember to insert your collaboration statement below

public class LinkedList170{
    // The head or first node, initially null

	private Node head;

  /**
   * No-argument constructor creates a linked list with no elements.
   */
  public LinkedList170() {
  	head = null;
  }
  
  /**
   * A linked list is empty if its head node is null.
   * @return whether the list is empty.
   */
  public boolean isEmpty() {
   if(head == null) {
      return true;
   } else {
      return false;
   }
  }
  
  /**
   * removeFirst removes the first node of the list. If the list was
   * empty, it does nothing. removeFirst does not return the node. To
   * remove the first node and return it, first call getFirst() and then
   * call removeFirst()
   */
   public void removeFirst() {
      if(head != null) {
        head = head.getNext();
      }
   }
   
   public void addFirst(int data) {
      //create a new Node to add to front of LL
      Node n = new Node( data );
      
      //make new Node point to "old" LL
      n.setNext( head );
      
      //update head to reference new front of LL
      head = n;
      
   }


  /**
   * size calculates length of the list by traversing
   * @return the number of nodes in the list
   */
  public int size() {
   int counter = 0;
   Node temp = head;
   
   while( temp != null ) {
      counter++;
      temp = temp.getNext();
   }
   return counter;
  }
  
  /**
   * toString calculates the string representation of the list by
   * traversing it and giving the concatenation of the string
   * representation of the constituent nodes
   * @return the string representation of the list
   */
  public String toString() {
   String s = "head -> ";
   Node temp = head;
   
   while(temp != null) {
      s += temp.getData();  //s += temp;  //s += temp.toString();
      s += " -> ";
      System.out.println(s);
      temp = temp.getNext();
   }
   s += "null";
   return s;
  }
}
