package bai3;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m;
        System.out.println("Nhập sl cột và dòng của ma trận: ");
        m = sc.nextInt();
        int arr[][]=new int[m][m];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <m ; j++) {

                System.out.println("["+i+"]["+j+"]");
                arr[i][j]= sc.nextInt();
            }
        }

        int max=arr[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <m ; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);



    }
}
