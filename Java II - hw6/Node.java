public class Node {
   
   private String data;
   private Node left, right;
   private int count;
   
    /**
      constructor for Node, receives data to put in node,
      sets nodes left and right stems to null and starts a
      count at 1.
      @param val receives value to put into node.
    **/     
   public Node(String val) { 
      data = val;
      left = null;
      right = null; 
      count = 1;
   }
   
   /**
      setter method used to set data to a certain node.      
      @param d is a string that is to be put in a node.
    **/
    public void setData(String d) {
      data = d;
   }
   
   
   /**
      getter method used to get data from a certain node.      
      @return data is a string that is in a node.
    **/
   public String getData() {
      return data;
   }
   
   /**
      method used to increase count as the same word is 
      added to the tree.
    **/
   public void increaseCount() {
      count++;
   }
   
   
   /**
      getter method used to retrieve the number of words
      there are in the tree.
      @return count is an integer that counts upward. 
    **/
   public int getCount() {
      return count;
   }
        
   /**
      method used to check if there is anything on the left
      branch of a node. 
      @return left returns what is in the left branch.
    **/
   public Node getLeft() {
      return left;
   }
   
   
   /**
      method used to check if there is anything on the right
      branch of a node. 
      @return left returns what is in the right branch.
   **/
   public Node getRight() {
      return right;
   }
   
   /**
      method used to set a node on the left branch. 
      @param l is what the node on the left branch is set to.
   **/
   public void setLeft(Node l) {
      left = l;
   }
   
   /**
      method used to set a node on the right branch. 
      @param r is what the node on the right branch is set to.
   **/
   public void setRight(Node r) {
      right = r;
   }
   
    /**
      method that turns data generated in Node Class and converts
      key values to Strings. 
      @return output with data from nodes.
   **/
   public String toString() { 
      return data + " (" + count + ")"; 
   }
   
}