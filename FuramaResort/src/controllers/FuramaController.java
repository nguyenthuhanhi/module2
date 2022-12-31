package controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        int choose;
        do {
            choose = 0;
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("Mời nhập sự lựa chọn của bạn");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    System.out.println("Mời bạn chọn:");
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    System.out.println("Mời bạn chọn:");
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    System.out.println("Mời bạn chọn:");
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    System.out.println("Mời bạn chọn:");
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    System.out.println("Mời bạn chọn:");
                    break;
            }
        } while (choose != 6);


    }

    public static void main(String[] args) {
        displayMainMenu();

    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int choose =0;
//
//            do {
//                System.out.println("1.\tEmployee Management\n" +
//                        "2.\tCustomer Management\n" +
//                        "3.\tFacility Management \n" +
//                        "4.\tBooking Management\n" +
//                        "5.\tPromotion Management\n" +
//                        "6.\tExit\n");
//                System.out.println("Mời nhập sự lựa chọn của bạn");
//                choose= sc.nextInt();
//
//            }while (choose!=6);
//
//
//    }


}
