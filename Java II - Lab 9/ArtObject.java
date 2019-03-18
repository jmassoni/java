import java.io.*;
import java.util.Scanner;

public class ArtObject {
	private String fileName;

	public ArtObject(String fn) {
		fileName = fn;
	}

	public void draw() throws FileNotFoundException {
      File input = new File(fileName);
      Scanner in = new Scanner(input);
      
      while(in.hasNextLine()) {
         
         String s = in.nextLine();
         String g = processLine(s);
         System.out.println(g);
         
      }
      
      
	}
   
   public String processPair(char a, int n) {
      
      String x = "";
      
      for (int i = 0; i < n; i++)
      {
         x += a;
         
      }
      
      return x;
   
   }
   
   public String processLine(String s) {
      
      Scanner inline = new Scanner(s);
      inline.useDelimiter(",");
      String lines = "";

      while(inline.hasNext())
      {
               
         char a = inline.next().charAt(0);
         int n = inline.nextInt();
      
         lines += processPair(a, n);
         
      
      }   
      
      s = lines;
      return s;
   
   }

	public static void main(String[] args) throws IOException {
		ArtObject a = new ArtObject("mystery2.txt");
		a.draw();
      
      
	}
}
