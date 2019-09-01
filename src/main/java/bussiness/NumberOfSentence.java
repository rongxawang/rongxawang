package bussiness;

public class NumberOfSentence {
    public static int number(String string)
    {
       String[] number = string.split(" ");
       return number.length;
    }
}
