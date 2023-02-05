package bai11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Dem_So_Lan_Xuat_Hien_Sd_Map {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        String st =sc.nextLine().toLowerCase();

        String[] newString =st.split(" ");

        System.out.println(Arrays.toString(newString));

        TreeMap<String, Integer> tree = new TreeMap<>();
        for (int i = 0; i <newString.length ; i++) {
            if (tree.containsKey(newString[i])){
                tree.put(newString[i], tree.get(newString[i])+1);

            } else {
                tree.put( newString[i],1);
            }
        }
        System.out.println("------------------------------");
        System.out.println(tree);
    }
}
