import java.util.*;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("a"); 
        int a = sc.nextInt();
        while (a != 0) {
            int remainder = a % 10;
           a=a/10;
           System.out.println(remainder);
        }
        // Read an integer from the user's input
        // Print the integer back to the console
          sc.close();
    }
}