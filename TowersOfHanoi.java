import java.util.Scanner;

public class TowersOfHanoi {

   public void solve(int n, String start, String auxiliary, String end, Scanner scanner) {
       if (n == 1) {
           System.out.println(start + " -> " + end);
           System.out.print("Type n for next move.");
           scanner.next();
       } else {
           solve(n - 1, start, end, auxiliary, scanner);
           System.out.println(start + " -> " + end);
           System.out.print("Type n for next move.");
           scanner.next();
           solve(n - 1, auxiliary, start, end, scanner);
       }
   }

   public static void main(String[] args) {
       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
       System.out.print("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       int discs = scanner.nextInt();
       towersOfHanoi.solve(discs, "A", "B", "C", scanner);
   }
}