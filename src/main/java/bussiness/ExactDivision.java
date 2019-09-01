package bussiness;

import java.util.Scanner;

public class ExactDivision {
    public static int exact(String string, int number) {
        String[] strings = string.split(" ");
        int result = 0;
        for (int i = 0; i<strings.length ; i++) {
            if (Integer.valueOf(strings[i]) % number == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();

        int result = exact(string, number);

        System.out.println(result);
    }
}
