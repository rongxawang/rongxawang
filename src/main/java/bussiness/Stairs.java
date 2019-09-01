package bussiness;

public class Stairs {
    public static int compute(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return compute(n - 1) + compute(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Stairs.compute(22));
    }
}
