// Remember to insert your collaboration statement below

/*

Joey Massoni
jmassoni
On my honor, I have not given, nor received, 
nor witnessed any unauthorized assistance on this work.
I worked on this homework with Maximiliano Castrillon.

*/

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
  	return (head == null);
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

  /**
   * size calculates length of the list by traversing
   * @return the number of nodes in the list
   */
  public int size() {
  	int length = 0;
  	Node temp = head;
  	while (temp != null) {
  		temp = temp.getNext();
  		length++;
  	}
  	return length;
  }
  
  /**
   * toString calculates the string representation of the list by
   * traversing it and giving the concatenation of the string
   * representation of the constituent nodes
   * @return the string representation of the list
   */
  public String toString() {
    String rep = "head ->  ";
    Node current = head;
    while(current != null) {
      rep += current.toString() + "  ->  ";
      current = current.getNext();
    }
    return rep + "null";
  }
  
  
  /**
   * getHead relays the first node from the list.
   * @return returns the first node, labeled head, or null if the list is empty.
   */
  public Node getHead(){
   if(head != null) {
      return head;
   }
   return null;
  }
  
  /**
   * addFirst adds a new node to the beginning of the list. If the list was
   * empty the new node would be the only node in the list. This new node
   * is set at head.
   * @param value receives a value to place in the new node/head that is created.
   */
  public void addFirst(int value){
   
   Node n = new Node(value);
   n.setNext(head);
   head = n;
   
  }
  
  
  /**
   * contains adds a new node to the beginning of the list. If the list was
   * empty the new node would be the only node in the list. This new node
   * is set at head.
   * @return an int indicating the index at which the value was found or -1
   * indicating that the value wasn't found.
   * @param value an int that indicates which number we are looking for
   * in the nodes of the list.
   */
  public int contains(int value)  {
   Node temp = head; //fake head
   int s = 0; //fake index
      
   while(temp != null) { //while LL has stuff
      if(temp.getData() == value) //if LL index holds right value
         {
            return s;//
         }
      s++; //move up one index
      temp = temp.getNext(); //progress through list
      
   }
   
   return -1;
  }
  
  /**
  * set takes a value and puts it into the node at that 
  * index. This shouldn't affect any other nodes.
  * @param index receives the node the new value should be 
  * written onto.
  * @param value receives an integer value to be written into
  * a particular index in the list.
  */ 
  public void set(int index, int value) {
   Node temp = head;
   int s = 0;

   
   if(index < 0){
      
      throw new IllegalArgumentException("error msg");
      
   }
   
   while(temp != null) {
      if(s == index) {
         
         temp.setData(value);
         
      }
      
      s++;
      temp = temp.getNext();
   }
 
   if(index >= s){
      
      throw new IllegalArgumentException("error msg");
      
   }
   
  }
  
  
  /**
  * removeNthNode finds a node indicated by an index and points the
  * node before it to the node after it, effectively erasing the node
  * indicated by the index from the list.
  * @param index tells us which node to remove from the list.
  */
  public void removeNthNode(int index) {
   Node temp = head;
   int s = 0;
   
   if(index < 0){
      
      throw new IllegalArgumentException("error msg");
      
   }
   
   
   while(temp != null) {
      if(index == 0){
            
         head = head.getNext();
            
      }
      
      else if(s == index - 1) {
         
         temp.setNext(temp.getNext().getNext());
                           
      }
      
      s++;
      temp = temp.getNext();
   }
   
   
  }
  
   /**
  * addNode puts a node with a given value at a particular
  * index and effectively moves all other nodes up one index
  * @param index tells us where to put the new node.
  * @param value tells us what number to put into the new node.
  */
  public void addNode(int index, int value) {
   Node temp = head;
   Node temp1 = new Node(value);
   int s = 0;
   
   if(index < 0){
      
      throw new IllegalArgumentException("error msg");
      
   }
   
         
   if(index == 0){
         
         
         head = temp1; 
         temp1.setNext(temp);
            
   }
   
   while(temp != null){


      if(s == index - 1) {
         
         Node temp2 = temp.getNext();
         temp.setNext(temp1);
         temp1.setNext(temp2);
         
      }
     
      s++;
      temp = temp.getNext(); 
   }
   
   if(index > s){
      
      throw new IllegalArgumentException("error msg");
      
   }
  
  }
}
