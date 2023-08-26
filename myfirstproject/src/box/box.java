package box;

public class box {
    int l;
    int b;
    int h;
    int side;

    
    box() {
        this.l=1;
        this.b=1;
        this.h=1;
    }

    box(int l, int h, int b) {
         this.l=l;
         this.b=b;
         this.h=h;
    }
                                 
    // cube;
    box(int side) {
      
       this.l=side;
         this.b=side;
         this.h=side;
}
    
}
