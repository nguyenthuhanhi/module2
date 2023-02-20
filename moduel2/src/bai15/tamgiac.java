package bai15;

import java.util.Scanner;

public class tamgiac {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.print("Nhập cạnh thứ 1 ");
            int canh1=Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh thứ 2 ");
            int canh2=Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh thứ 3 ");
            int canh3=Integer.parseInt(scanner.nextLine());
//            if (canh1 <0||side2<0||canh3<0 || ((canh1+canh3)<side2 || (canh1+side2)<canh3 || (side2+canh3)<canh1)){
//                throw new IllegalArgumentException("Không phải tam giác");
//            }
            if (canh1<0 || canh2<0||canh3<0){
                throw new IllegalArgumentException("Nhap gia tri là so duong.");
            }
            if ((canh1+canh2)>canh3||(canh1+canh3)>canh2||(canh2+canh3)>canh1){
                throw new IllegalArgumentException("tổng 2 cạnh không lớn hơn cạnh còn lại.");
            }
        }catch (NumberFormatException e){
            System.out.println("Không phải tam giác");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
