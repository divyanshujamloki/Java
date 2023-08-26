public class function {
    public static void main(String[] args) {
        int a = 153;
         System.out.print(arm(a));

    //     System.out.println(prime(a));
    //     if (prime(a) == 1) {
    //         System.out.println("prime");
    //     }
    //     else {
        
    //           System.out.println("Not prime");
    //  }

    }
    
    static int prime(int a) {

        for (int i = 2; i < Math.sqrt(a); i++) {

            if (a % i == 0) {
                return 0;
            }

        }
        return 1;
    }
    
    static int arm(int a) {
        // /154
        int b= (int)a;
        int digit=0;
        while (a>0) {

            int rem = a % 10;
            
            a = a / 10;
            digit =digit+ rem*rem*rem;

            

        }
  
        if (digit == b) {

            return 1;
        }
    return 0 ;
        


    }


}
