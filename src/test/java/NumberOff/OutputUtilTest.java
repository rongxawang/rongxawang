package NumberOff;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class OutputUtilTest {
    private Game game = new Game();
    private Integer[] array ;

    @Before
    public void BeforeMethod()
    {
        array = new Integer[]{2,4,6,8,7,5};
    }

    @Test
    public void size_of_result_should_equals_array_size()
    {
        String[] result = game.getResult(array);
        Assert.assertEquals(array.length,result.length);
    }

    @Test
    public void result_should_equals_expected()
    {
        String expectedResult = ReaderFile.readFileByLines("/Users/rongxa.wang/Documents/tw_practice/result.txt");
        String[] result = game.getResult(array);
        Assert.assertEquals(expectedResult,result.toString());
    }

}

