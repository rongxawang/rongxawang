package GuessNumer;

import GuessNumber.NumberGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NumberGeneratorTest {

    private int SIZE;
    NumberGenerator guessnumber = new NumberGenerator();

    @Before
    public void beforeMethod() {
        SIZE = 4;
    }

    @Test
    public void test_the_size_of_randomnum() {
        String result = guessnumber.getNumber();
        Assert.assertEquals(SIZE, result.length());
    }

    @Test
    public void ShouldGenerateNoRepeat() {
        String generatedNumber = guessnumber.getNumber();
        for (int index = 0; index < SIZE; index++) {
            Assert.assertFalse(generatedNumber.substring(index + 1, 4).contains(generatedNumber.substring(index, index + 1)));
        }
    }
}
