package GuessNumber;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new NumberGenerator(), new GuessResult(), new Printer(), new NumberReader());
        game.start();
    }
}
