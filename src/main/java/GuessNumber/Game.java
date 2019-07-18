package GuessNumber;

class Game {
    private static final String WIN_CODE = "4A0B";
    private int remainingGuessCount = 6;

    private NumberGenerator numberGenerator = new NumberGenerator();
    private GuessResult guessResult = new GuessResult();
    private NumberReader numberReader = new NumberReader();

    void start() {
        String guessNumber = numberGenerator.getNumber();
        while (remainingGuessCount > 0) {
            printMessage();
            String result;
            try {
                result = guessResult.getResult(numberReader.read(), guessNumber);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
            OutputWin(result);
            System.out.println(result);
            remainingGuessCount--;
        }
        System.out.println("Game Over,The number string is:" + DataChange.getStringwithSpace(guessNumber));
    }

    private void printMessage() {
        if (remainingGuessCount == 1) {
            System.out.println("Guess number game,you only have" + remainingGuessCount + "chance" + "Please input four numbers:");
        }
        if (remainingGuessCount != 1) {
            System.out.println("Guess number game,you have" + " " + remainingGuessCount + " " + "chances." + "Please input four numbers:");
        }
    }

    private void OutputWin(String result) {
        if (WIN_CODE.equals(result)) {
            System.out.println("you win");
        }
    }
}

