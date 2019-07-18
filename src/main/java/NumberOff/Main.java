package NumberOff;

public class Main {
    public static void main(String[] args) {

        Generator generator = new Generator();
        Game game = new Game();
        String[] result = game.getResult(generator.generate());
        OutputUtil.printString(result);
    }
}
