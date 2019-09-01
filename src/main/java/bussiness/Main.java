package bussiness;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int peach = 0 ;
        int rest = 1;
        int day  = 9;
        for(day = 9;day>0;day--)
        {
            peach = Monkey.getTotalPeach(rest);
            rest = peach;
        }
        System.out.println(peach);

        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        System.out.println(NumberOfSentence.number(string));

        int number = scanner.nextInt();
        System.out.println(Square.isSquare(number));
    }
}
