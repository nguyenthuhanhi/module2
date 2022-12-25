package bai6.CricleCylinder;

public class Cricle {
    protected static final double PI  = 3.1415 ;
    protected double bankinh;
    protected String mausac;

    public Cricle() {
    }

    public Cricle(float bankinh, String mausac) {
        this.bankinh = bankinh;
        this.mausac = mausac;
    }
    public double getArea(){
        return bankinh*bankinh*PI;
    }


    public String toString() {
        return "bán kính: "+bankinh+"\t màu sắc: "+mausac +"\t diện tích"+getArea() ;
    }

}
