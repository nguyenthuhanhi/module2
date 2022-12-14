package bai1;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        final double vnd=23000;
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời bạn nhập usd");
        usd = sc.nextDouble();
        double quydoi= usd*vnd;
        System.out.println("USD sang VND :"+quydoi);
    }
}
