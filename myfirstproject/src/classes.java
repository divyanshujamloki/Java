public class classes {
    public static void main(String[] args) {

        student s1 = new student(5, "dj", 56);
        student a;
        student s2 = new student();
        // System.out.println(s1.name);
        for (int i = 0; i < 1000000; i++) {
            a = new student();
              
        // System.out.println(s1.name + s1.marks);
        System.out.println(s2.marks+s2.name);
       }
        
    }

}

 class student {
        int roll;
        String name;
        int marks;
        
        student() {
            this(5, "divyansuh", 100);
            System.out.println("created");
        }
        
       @Override  
    protected void finalize() throws Throwable  
    {   
        System.out.println("destroy");   
    }   

        student(int r, String n, int m) {

            this.roll = r;
            this.marks = m;
            this.name=n;

        } 

} 
