package GuessNumber;


import java.util.Scanner;

import static GuessNumber.DataChange.containRepeatNum;

public class NumberReader {
    private Scanner scanner = new Scanner(System.in);

    public String read() throws Exception {

        String inputNumberWithNoSpace;
        String inputNumber = scanner.nextLine();
        inputNumberWithNoSpace = DataChange.getNoSpaceString(inputNumber);

        if (!containRepeatNum(inputNumberWithNoSpace) && inputNumberWithNoSpace.length() == 4) {
            return inputNumberWithNoSpace;
        }
        throw new Exception("Wrong Input,Input again");
    }
}