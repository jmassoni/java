import java.util.Random;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenerateNums {
   public static void main(String[] args) throws IOException {
      FileOutputStream fileByteStream = new FileOutputStream("RandomNums.txt");
      PrintWriter outFS = new PrintWriter(fileByteStream);
      Random rand = new Random();
      
      for (int i = 0; i < 250000; i++) {
         int r = rand.nextInt(20);
         outFS.println(r);
      }
      outFS.flush();
      fileByteStream.close();
   }
}