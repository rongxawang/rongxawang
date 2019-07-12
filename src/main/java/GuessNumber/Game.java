package GuessNumber;

public class Game {
    private static final String WIN_CODE = "4A0B";
    private NumberReader numberReader;
    private GuessResult guessResult;
    private NumberGenerator numberGenerator;
    private Printer printer;

    private int remainingGuessCount = 6;

    public Game(NumberGenerator numberGenerator, GuessResult guessResult, Printer printer, NumberReader numberReader) {
        this.numberReader = numberReader;
        this.printer = printer;
        this.numberGenerator = numberGenerator;
        this.guessResult = guessResult;
    }

    public void start() {
        String guessNumber = numberGenerator.getNumber();
        while (remainingGuessCount > 0) {
            try {
                if (remainingGuessCount == 1) {
                    printer.print("Guess number game,you only have" + remainingGuessCount + "chance" + "Please input four numbers:");
                }
                if (remainingGuessCount != 1) {
                    printer.print("Guess number game,you have" + " " + remainingGuessCount + " " + "chances." + "Please input four numbers:");
                }
                String result = guessResult.getResult(numberReader.read(), guessNumber);

                if (WIN_CODE.equals(result)) {
                    printer.print("you win");
                    return;
                }
                printer.print(result);
                remainingGuessCount--;
            } catch (Exception e) {
                printer.print(e.getMessage());
            }
        }
        printer.print("Game Over,The number string is:" + guessNumber);

    }
}
