package bai4;

public class LopFan {
    private static final int SLOW  = 1;
    private static final int MEDIUM  = 2;
    private static final int FAST  = 3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public LopFan() {
    }

    public LopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on==true){
            return "Speed:"+speed+"\t color:"+color+"\t radius:"+radius+"\t fan is on.";
        } else {
            return  "color:"+color+"\t radius:"+radius+"\t fan is off.";

        }

    }

    public static void main(String[] args) {
        LopFan Fan1=new LopFan(3,true,10,"yellow");
        LopFan Fan2=new LopFan(2,false,5,"blue");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}
