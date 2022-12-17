package bai3;

public class BaiTap3 {
    public static void main(String[] args) {
        int arr1[]={5,4,2,3,7,9,1};
        int arr2[]={7,9,8,2,4,1,5,7,3};
        int arr3[]=new int[arr1.length+arr2.length];
        int count=0;
        for (int i = 0; i <arr1.length ; i++) {
            arr3[count]+=arr1[i];
            count++;
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[count]+=arr2[i];
            count++;
        }
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr3[i]);
        }
    }
}

