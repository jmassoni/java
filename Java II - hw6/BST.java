public class BST {
   
    //instance variable for root node
    private Node root;
    
    /**
      constructor for BST object - sets root to null
    **/
    public BST() {
      root = null;
    }

   public Node getRoot() {
      return root;
   }
   /**
      method which searches for a specific target String in the tree
   
      @returns the number of times target has been inserted into the tree or 0 if it does not exist in the tree.
   **/
    public int contains(String target) {
        Node temp = root;
        while (temp != null) {
            String d = temp.getData();
            if (d.compareTo(target) > 0) {  //target precedes temp
               temp = temp.getLeft();
            } else if (d.compareTo(target)< 0) {  //target follows temp
               temp = temp.getRight();
            } else {  //temp and target are the same
               return temp.getCount();
            }
        }
        return 0;
    }
   
   /**
      method which inserts data into a Node that is part of a tree.
   
      @param value receives the value to input into the node.
   **/
   public void insert(String value) {
      
      Node temp = root;
      
      if (temp == null) {
         
         Node first = new Node(value);
         root = first;
         
      }
      
      while (temp != null) {
                        
            if (value.compareTo(temp.getData()) > 0) {  
               if (temp.getRight() == null) {
                  Node notFirst = new Node(value);
                  temp.setRight(notFirst);
                  return;
                  
               } else {
                  temp = temp.getRight();
               }
            } else if (value.compareTo(temp.getData()) < 0) {
               if (temp.getLeft() == null) {
                  Node notFirst = new Node(value);
                  temp.setLeft(notFirst);
                  return;
               } else {
                  temp = temp.getLeft();
               }
            } else {
               
               temp.increaseCount();
               return;
            }       
      }

            
   }
   
   /**
      helper method used to recursively place data within nodes
      into a special order
      @param n receives the value that needs to be put in order.
   **/
   private void inOrderHelper(Node n) {

      if(n == null){
         return;
      } 
      
      inOrderHelper(n.getLeft());
      System.out.println(n.getData());
      inOrderHelper(n.getRight());
      
      return;
      
   }
   
   /**
      method which attempts to order data from a BST.
   **/   
   public void inOrder() {
      Node temp = root;
      
      inOrderHelper(temp);
      
   }
   
   /**
      method which finds the word that has occured
      the least within the BST.
      @return a word with the amount of times it's
      occured in the BST.
   **/  
   public String findMin() {
      return "min";
   }
   
  /**
      method which finds the word that has occured
      the most within the BST.
      @return a word with the amount of times it's
      occured in the BST.
   **/   
   public String findMax() {
      return "max";
   }
}
