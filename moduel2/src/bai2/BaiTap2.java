package bai2;

public class BaiTap2 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (count <20) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }

        }
        return true;
    }
}
