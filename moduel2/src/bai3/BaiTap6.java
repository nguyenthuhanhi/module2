package bai3;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Nhập số cột và dòng của ma trận:");
        m= sc.nextInt();
        int arr[][]= new int[m][m];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.println("["+i+"]["+j+"]");
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Nhập cột mà bạn muốn tính tổng:");
        int pillar= sc.nextInt();
        int sum=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <m ; j++) {
                if (j==pillar){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
