package bai7.bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shape s[]=new Shape[3];
        s[0]=new Rectangle(2.0,1.2,"red",true);
        s[1]=new Circle(2.0,"blue",true);
        s[2]=new Square(2.0,"yellow",true);
        System.out.println("Trước khi tăng kích thước mảng: ");
        for (Shape sh: s) {
            System.out.println(sh.toString());
        }

        System.out.println("Sau khi tăng kích thước mảng: ");
        for (Shape sh: s) {
            sh.resize((float) (Math.random()*100));
            System.out.println(sh.toString());
        }

    }
}
