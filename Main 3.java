public class Main {
  /// This class tests your LinkedList170 code
  public static void main(String[] args) {
    LinkedList170 ls = new LinkedList170();
    System.out.println("LinkedList170 is empty: " + ls.isEmpty());
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 
    ls.removeFirst();

    int i1 = 4;
    int i2 = 6;
    int i3 = 8;
    
    System.out.println("\nAdding first three nodes using addFirst!");
    ls.addFirst(i3); //8  ls.addFirst(8);
    ls.addFirst(i2); //6  ls.addFirst(6);
    ls.addFirst(i1); //4  ls.addFirst(4);
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 
  }
}