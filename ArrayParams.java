public class ArrayParams {
   /**
   * printing an array (example of a fencepost problem)
   * 
   * @param a array to be printed
   **/
   public static void print(int[] a) {
      for(int i = 0; i < a.length; i++) {
         if(i == a.length - 1) {
            System.out.println( a[i] );
         } else {
            System.out.print( a[i] + ", " );
         }
      }
   }


   public static void method1(int[] a) {
      System.out.println("a: " + a);
      int temp = a[0];  //element swap
      a[0] = a[a.length-1];
      a[a.length - 1] = temp; 
   }
   
   public static void method2(int[] a) {
      System.out.println("a: " +a);
      //NOTE: ASSIGNING A NEW VALUE TO a
      a = new int[4];
      System.out.println("a: " + a);
      a[0] = 4;
      a[1] = 3;
      a[2] = 2;
      a[3] = 1;
      int temp = a[0]; //element swap
      a[0] = a[a.length-1];
      a[a.length - 1] = temp; 
   }
   
   public static void main(String[] args) {
      int[] x = {1, 2, 3, 4};
      
      //will method1 change x's value?
      //will method1 change the "state" of x (the values in x)
      print(x);
      System.out.println("x: " + x);
      method1(x);
      print(x);
      System.out.println("x: " + x);*/
     
      //will method2 change y's value?
      //will method2 change the "state" of y (the values in y)
      int[] y = {1, 2, 3, 4};
      print(y);
      System.out.println("y: " + y);
      method2(y);
      print(y);
      System.out.println("y: " + y);
   }  
}