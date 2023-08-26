import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
           System.out.println("a input ");
           int a = sc.nextInt();
          // Read an integer from the user's input
        System.out.println(a); // Print the integer back to the console
          sc.close();
    }
}
