package bussiness;

import java.util.Scanner;

public class issushu {
    public static boolean isSushu(int n) {
        int i = n;
        if (i < 2)
            return false;
        else {
            for (i = n - 1; i >= 2; i--) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = issushu.isSushu(scanner.nextInt());
        System.out.println(result);
    }
}
