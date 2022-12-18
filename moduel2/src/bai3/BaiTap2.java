package bai3;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int []arr={1,5,8,2};
        int []newArr= new int[arr.length+1];
        //int []newArr = {0,0,0,0,0};
        Scanner sc= new Scanner(System.in);
        int value,index;
        System.out.println("Nhập vị trí muốn chèn:");
        index = sc.nextInt();
        // 2
        System.out.println("Nhập giá trị muốn chèn: ");
        value=sc.nextInt();
        // 1 5 7 8 2

        for (int i = newArr.length-1; i >=0 ; i--) {
            if (i>index){
                newArr[i]=arr[i-1];
                // 0 0 0 0 2
                // 0 0 0 8 2
            } else if (i==index) {
                newArr[i]=value;
                // 0 0 7 8 2
            } else if (i<index) {
                newArr[i]=arr[i];
            }
        }
        for (int i = 0; i <newArr.length ; i++) {
            System.out.println(newArr[i]);
        }


    }
}
