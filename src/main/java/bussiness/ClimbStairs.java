package bussiness;

public class ClimbStairs {
    public static int fangan(int stairs) {
        int a = 1;
        int b = 2;
        int result = 0;

        if (stairs == 1 || stairs == 2) {
            return stairs;
        } else {
            for (int i = 3; i <= stairs; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.print(fangan(4));
    }
}
