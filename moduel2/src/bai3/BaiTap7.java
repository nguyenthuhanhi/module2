package bai3;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cô và dòng của ma trận");
        int m;
        m = sc.nextInt();
        float arr[][] = new float[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("[" + i + "][" + j + "]");
                arr[i][j] = sc.nextFloat();
            }


        }
        float sum=0f;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <m ; j++) {
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
