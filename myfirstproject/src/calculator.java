import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int ans = 0;
        while (true) {
            System.out.println("Enter Input op");
            char op = sc.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
            break;
            }
            System.out.println("Enter Input 1");
            int a = sc.nextInt();
            System.out.println("Enter Input 2");
            int b = sc.nextInt();
           
            
           

            if (op == '+') {
                ans = a + b;
            }

            else if  (op == '-') {
                ans = a - b;
            }

            else if  (op == '*') {
                ans = a * b;
            }

            else if  (op == '/') {
                ans = a / b;
            }

           else if (op == 'X' || op == 'x') {
                break;
            }

            // else {
            //     System.out.println("Invalid Input");
            // }

        }
        System.out.println(ans);


 sc.close();
    }
    
}
