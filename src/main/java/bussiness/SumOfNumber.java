package bussiness;

public class SumOfNumber {
    public static int sum(int number) {
        int result = 0;
        int i = 0;
        while (number > 0) {
            i = number % 10;
            if (i % 2 == 0) {
                result += i;
            }
            number = number / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SumOfNumber.sum(5212));
    }
}
