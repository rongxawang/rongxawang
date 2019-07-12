package GuessNumber;

import java.util.Random;

/*
 得到随机的0-9内不重复数组
*/
public class NumberGenerator {

    private static final int SIZE = 4;

    public String getNumber() {
        String number = "";
        Random random = new Random();
        int index = 0;
        while (index < SIZE) {
            String temp = "";
            int num = random.nextInt(10);
            temp += (char) ('0' + num);
            if (!number.contains(temp)) {
                number += (char) ('0' + num);
                index++;
            }
        }
        return number;
    }
}
