package bai1;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập 1 số nguyên");
            number = Integer.parseInt(sc.nextLine());
        } while (number > 999 && number < 0);
        //123
        String tram = "";
        String chuc = "";
        String donvi = "";
        int temp = number;
        int a = temp / 100;
        temp %= 100;
        int b = temp / 10;
        int c = temp % 10;

        switch (a) {
            case 1:
                tram = "One hundred";
                break;
            case 2:
                tram = "Two hundred";
                break;
            case 3:
                tram = "Three hundred";
                break;
            case 4:
                tram = "Four hundred";
                break;
            case 5:
                tram = "Five hundred";
                break;
            case 6:
                tram = "Six hundred";
                break;
            case 7:
                tram = "Seven hundred";
                break;
            case 8:
                tram = "Eight hundred";
                break;
            case 9:
                tram = "Nine hundred";
                break;
        }
        if (b == 1) {
            switch (c) {
                case 0:
                    chuc = "ten";
                    break;
                case 1:
                    chuc = "Eleven";
                    break;
                case 2:
                    chuc = "Twelve";
                    break;
                case 3:
                    chuc = "thirteen";
                    break;
                case 4:
                    chuc = "fourteen";
                    break;
                case 5:
                    chuc = "fifteen";
                    break;
                case 6:
                    chuc = "sixteen";
                    break;
                case 7:
                    chuc = "seventeen";
                    break;
                case 8:
                    chuc = "eighteen";
                    break;
                case 9:
                    chuc = "nineteen";
                    break;
            }
        } else {
            switch (b) {
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "forty";
                    break;
                case 5:
                    chuc = "fifty";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;
            }
        }

        switch (c) {
            case 0:
                donvi = "zero";
                break;
            case 1:
                donvi = "one";
                break;
            case 2:
                donvi = "two";
                break;
            case 3:
                donvi = "three";
                break;
            case 4:
                donvi = "four";
                break;
            case 5:
                donvi = "five";
                break;
            case 6:
                donvi = "six";
                break;
            case 7:
                donvi = "seven";
                break;
            case 8:
                donvi = "eight";
                break;
            case 9:
                donvi = "nine";
                break;
        }
        if (a == 0 && b == 0) {
            System.out.println(donvi);
        } else if (a == 0 && c == 0) {
            System.out.println(chuc);
        } else if (a == 0 && b != 1) {
            System.out.println(chuc + " " + donvi);
        } else if (a == 0 && b == 1) {
            System.out.println(chuc);
        } else if (c == 0 || b == 1) {
            System.out.println(tram + " and " + chuc);
        } else if (b != 1) {
            System.out.println(tram + " and " + chuc + " " + donvi);
        }


    }
}
