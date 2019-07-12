package GuessNumber;

public class GuessResult {

    private static final int NUMBER_LENGTH = 4;
    private int A = 0;
    private int B = 0;

    String numberInWithNoSpace;

    public String getResult(String numberIn, String guessNumber) {
        A = 0;
        B = 0;
        numberInWithNoSpace = DataChange.getNoSpaceString(numberIn);

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

