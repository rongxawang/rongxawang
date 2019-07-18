package NumberOff;

public class Game {
    private Judgement judgement = new Judgement();
    private static final String MultipleOf3 = "Fizz";
    private static final String MultipleOf5 = "Buzz";
    private static final String MultipleOf7 = "Whizz";

    public String[] getResult(Integer[] array) {
        String[] result = new String[array.length];

        for (int index = 0; index < array.length; index++) {
            result[index] = "";
            if (judgement.judgeMultipleOf3(array[index])) {
                result[index] += MultipleOf3;
            }
            if (judgement.judgeMultipleOf5(array[index])) {
                result[index] += MultipleOf5;
            }
            if (judgement.judgeMultipleOf7(array[index])) {
                result[index] += MultipleOf7;
            }
            result[index] = (result[index].equals("")) ? result[index] + array[index].toString() : result[index];
        }
        return result;
    }
}
