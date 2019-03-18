/**
 * A generic node in a list.
 * A node has a link to the next node in the list and
 * some contents of type int
 */
public class Node {
  
  private int data;
  private Node next;

  /**
   * Constructor which sets the data value of the current node to 
   * the parameter's value
  **/
  public Node(int d) {
    this.data = d;
    this.next = null;
  }

  
  /**
   * Get the data from the node
   * @return the data contained in this node
   */
  public int getData() {
    return this.data; 
  }
  
  /**
   * Get the next node following this one
   * @return the node after this node
   */
  public Node getNext() {
    return this.next; 
  }
  
  /**
   * Set or reset the data contained in this node
   * @param the data to be contained in this node
   */
  public void setData(int d) {
    this.data = d;
  }
  
  /**
   * Set or reset the next node following this one. If the node 
   * already had a next node, the reference to it will be deleted
   * and overwritten with the new one.
   * @param the node after this node
   */
  public void setNext(Node n) {
    this.next = n;
  }
  
  /**
   * toString creates a string corresponding to this node
   * @return the string representation of this node
   */
  public String toString() {
    return "" + getData();
  }
  
}
