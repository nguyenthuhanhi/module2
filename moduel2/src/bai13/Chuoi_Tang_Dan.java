package bai13;

import java.util.LinkedList;
import java.util.Scanner;

public class Chuoi_Tang_Dan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine();
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > linkedList.getLast()) {
                linkedList.add(str.charAt(i));
            }
        }
        for (Character item : linkedList) {
            System.out.print(item);
        }
    }
}
