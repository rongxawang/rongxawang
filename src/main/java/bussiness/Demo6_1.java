package bussiness;

public class Demo6_1 {
    public static void main(String[] args) {
        tenToTwo(23);
    }

    public static void tenToTwo(int n) {
        String s = "";
        while (n != 0) {
            s = n % 2 + s;
            n = n / 2;
        }
        System.out.print(s);
    }
}
