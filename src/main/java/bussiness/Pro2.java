package bussiness;

public class Pro2 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("101到200之间的素数有：");
        for (int i = 101; i < 201; i++) {
            if (isSushu(i)) {
                count++;
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("一共"+count+"个。");
    }

    public static boolean isSushu(int n) {
        int i = n;
        if (n == 1) {
            return false;
        } else {

            for (i = n - 1; i >= 2; i--) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
