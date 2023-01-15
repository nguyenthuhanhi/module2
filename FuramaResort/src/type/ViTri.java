package type;

import java.util.Scanner;

public enum ViTri {
    letan, phucvu, chuyenvien, giamsat, quanly, giamdoc;
    public static ViTri giatriViTri(){
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Lễ Tân.\t2.Phục Vụ\t3.Chuyên Viên\t4.Giám Sát\t5.Quản Lý\t6.Giám Đốc");
        System.out.println("Mời chọn vị trí công việc");
        int chooseViTri=sc.nextInt();
        switch (chooseViTri) {
            case 1:
                return ViTri.letan;
            case 2:
                return ViTri.phucvu;
            case 3:
                return ViTri.chuyenvien;
            case 4:
                return ViTri.giamsat;
            case 5:
                return ViTri.quanly;
            case 6:
                return ViTri.giamdoc;
        }
        return null;
    }
}
