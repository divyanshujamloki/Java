package box;

import box.box;
import box.boxprice;
public class maina {
    public static void main(String[] args) {

        // box b = new box(1,5,65);
        // System.out.println(b.b);
        //  System.out.println(b.h);
        //  System.out.println(b.l);
          
        boxweight obj = new boxweight(1, 5, 3, 8);
    //   System.out.println(obj.l);
    //   System.out.println(obj.h);
    //   System.out.println(obj.weight);
    obj.foo();
    boxprice obj2 = new boxprice(0, 0, 0, 0, 100);
           System.out.println(obj2.p);
    }
}
