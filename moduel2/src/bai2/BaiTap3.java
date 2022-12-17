package bai2;

public class BaiTap3 {
    public static void main(String[] args) {
        for (int i = 2; i <100 ; i++) {
            if (isPrimne(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static boolean isPrimne(int x){
        if (x<2){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(x) ; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }

}
