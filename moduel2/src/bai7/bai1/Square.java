package bai7.bai1;

public class Square extends Shape {
    private double a = 1.0;

    public Square() {
    }

    public Square(double a, String color, boolean filled) {
        super(color, filled);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square a= "
                + a + super.toString()
                ;
    }

    @Override
    public void resize(float percent) {
            this.a+=getA()*(float)percent/100;
    }
}
