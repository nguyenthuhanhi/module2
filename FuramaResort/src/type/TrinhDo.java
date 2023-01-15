package type;

import java.util.Scanner;

public enum TrinhDo {
    trungcap, caodang, daihoc, saudaihoc;

    public static TrinhDo giaTriTrinhDo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Trung Cấp\t2.Cao Đẳng\t3.Đại Học\t4.Sau Đại học");
        System.out.println("Chọn trình độ học vấn: ");
        int chooseTrinhDo = sc.nextInt();
        switch (chooseTrinhDo) {
            case 1:
                return TrinhDo.trungcap;
            case 2:
                return TrinhDo.caodang;
            case 3:
                return TrinhDo.daihoc;
            case 4:
                return TrinhDo.saudaihoc;
        }
        return null;
    }
}
