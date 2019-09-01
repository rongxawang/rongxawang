package bussiness;

public class Demo2_1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        getNumber(a, b, c);
    }

    public static void getNumber(int a, int b, int c) {
        int count = 0;
        for (int number = 1000; number < 10000; number++) {
            if (number % a == 0 && (number + 1) % b == 0 && (number + 2) % c == 0) {
                count++;
                System.out.print(number + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
