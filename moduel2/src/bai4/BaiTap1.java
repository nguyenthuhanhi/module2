package bai4;

import java.util.Scanner;

public class BaiTap1 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Nhập a,b,c:");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            QuadraticEquation qt=new QuadraticEquation(a,b,c);
            if (qt.getDiscriminant()>0){
                System.out.println(qt.getRoot1());
                System.out.println(qt.getRoot2());
            } else if (qt.getDiscriminant()==0) {
                System.out.println(qt.getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }

        }
    }


