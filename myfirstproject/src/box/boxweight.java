package box;

public class boxweight extends box {
    double weight;
     
    public boxweight() {
        weight = -1;
    }

    public boxweight(int l, int b, int h, double weight) {

        super(l, h, b);

        this.weight = weight;

    }

    public void foo(){
        System.out.println("hello");
    }
    
}
