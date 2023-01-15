package bai11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Stack<Integer> arrNumber = new Stack<>();
        System.out.println("nhập size: ");
        int size = sc.nextInt();
        int []arr=new int[size];
        for (int i = 0; i <size; i++) {
            System.out.println("nhập element thứ "+i+": ");
            arr[i]=arrNumber.push(sc.nextInt());

        }
        System.out.println("Mảng trước khi đảo ngược: ");
        System.out.println(arrNumber);
        for (int i = 0; i <size ; i++) {
            arr[i]=arrNumber.pop();
        }
        System.out.println("mảng sau khi đảo ngược: ");
        System.out.println(Arrays.toString(arr));

    }
}
