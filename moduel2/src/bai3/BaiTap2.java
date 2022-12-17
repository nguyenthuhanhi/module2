package bai3;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int []arr={1,5,4,3,6,7,8,2};
        int []newArr= new int[9];

        Scanner sc= new Scanner(System.in);
        int value,index;
        System.out.println("Nhập vị trí muốn chèn:");
        index = sc.nextInt();
        System.out.println("Nhập giá trị muốn chèn: ");
        value=sc.nextInt();

        for (int i = 0; i <arr.length; i++) {
            arr[i]=newArr[i];
        }


    }
}
