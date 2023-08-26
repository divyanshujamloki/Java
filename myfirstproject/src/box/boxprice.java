package box;

public class boxprice extends boxweight {
    int p;

    public boxprice() {
        this.p = 5;
    }
    public boxprice(int p ) {
        this.p = p;
    }
    
    public boxprice(int l ,int b,int h,double weight,int p) {
        super(l, b, h, weight);
        this.p=p;

    }
}
