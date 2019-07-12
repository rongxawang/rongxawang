package GuessNumber;


import java.util.Scanner;

import static GuessNumber.DataChange.containRepeatNum;

public class NumberReader {
    private Scanner scanner = new Scanner(System.in);
    private String inputNumberWithNoSpace;

    public String read() throws Exception {

        String inputNumber = scanner.nextLine();
        inputNumberWithNoSpace = DataChange.getNoSpaceString(inputNumber);

        if (containRepeatNum(inputNumberWithNoSpace) == false && inputNumberWithNoSpace != null && inputNumberWithNoSpace.length() == 4) {
            return inputNumberWithNoSpace;
        }
        throw new Exception("Wrong Input,Input again");
    }
}