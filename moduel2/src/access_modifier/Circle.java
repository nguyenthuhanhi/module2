package access_modifier;

public class Circle {
    private static final double PI = 3.14;
    private double radius =1.0;
    private String color="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     protected  double getRadius() {
        return radius;
    }

     protected double getArea(){
        return radius*radius*PI;
    }

//    public static void main(String[] args) {
//        Circle circle=new Circle();
//        System.out.println("bk hình tròn: "+circle.getRadius());
//        System.out.println("S hình tròn: "+circle.getArea());
//    }

}

