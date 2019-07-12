package GuessNumer;

import GuessNumber.GuessResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuessResultTest {

    GuessResult guessResult = new GuessResult();
    String guessresult = new String();
    String guessnumber = new String();

    @Before
    public void beforeMethod() {
        guessnumber = "5678";
        guessresult = "7895";
    }

    @Test
    public void test_output_result() {
        String expectstr = "0A3B";
        String output = guessResult.getResult(guessresult, guessnumber);
        Assert.assertEquals(expectstr, output);
    }
}
