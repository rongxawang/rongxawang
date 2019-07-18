package GuessNumber;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GuessResult {

    private static final int NUMBER_LENGTH = 4;

    public String getResult(String numberInWithNoSpace, String guessNumber) {
        int A = 0;
        int B = 0;
        for (int index = 0; index < NUMBER_LENGTH; index++) {
            if (numberInWithNoSpace.charAt(index) == guessNumber.charAt(index)) {
                A++;
            } else if (numberInWithNoSpace.contains(guessNumber.substring(index, index + 1))) {
                B++;
            }
        }
        return A + "A" + B + "B";
    }

}

