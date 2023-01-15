package type;

import java.util.Scanner;

public enum LoaiKhach {
    Diamond, Platinium, Gold, Silver, Member;
    public static LoaiKhach giaTriLoaiKhach(){
        Scanner  sc=new Scanner(System.in);
        System.out.println("1.Diamond\t2.Platinium\t3.Gold\t4.Silver\t5.Member");
        System.out.println("Chọn loại khách: ");
        int chooseLoaiKhach = sc.nextInt();
        switch (chooseLoaiKhach){
            case 1:
                return LoaiKhach.Diamond;
            case 2:
                return LoaiKhach.Platinium;
            case 3:
                return LoaiKhach.Gold;
            case 4:
                return LoaiKhach.Silver;
            case 5:
                return LoaiKhach.Member;
        }
        return null;
    }
}
