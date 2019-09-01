package bussiness;

public class fenshusum {
    public static void main(String[] args) {
        sum(2);
    }

    public static void sum(double n) {
        double result = 0;
        if (n % 2 == 0) {
            for (double i = 2; i <= n; i += 2) {
                result += 1 / i;
            }
        } else {
            for (double i = 1; i <= n; i += 2) {
                result += 1 / i;
            }
        }

        String num = String.format("%.16f", result);
        System.out.println(num);
    }
}
