package GuessNumer;

import GuessNumber.GuessNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GuessNumberTest {

    private int SIZE;
    GuessNumber guessnumber = new GuessNumber();

    @Before
    public void beforeMethod()
    {
        SIZE = 4;
    }

    @Test
    public void test_the_size_of_randomnum()
    {
        String result = guessnumber.getNumber();
        Assert.assertEquals(SIZE,result.length());
    }
}
