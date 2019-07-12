package GuessNumer;

import GuessNumber.DataChange;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DataChangeTest {

    String str1 = new String();
    String str2 = new String();
    String str3 = new String();
    String str4 = new String();
    String str5 = new String();

    @Before
    public void beforeMethod() {

        str1 = "3456";
        str2 = "1145";
        str3 = "";

        str4 = "1 2 3 4";
        str5 = "1234";

    }

    @Test
    public void result_should_return_false_when_str_has_no_repeatnumber() {
        boolean result = DataChange.containRepeatNum(str1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void result_should_return_true_when_str_has_repeatnumber() {
        boolean result = DataChange.containRepeatNum(str2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void result_should_return_false_when_str_is_empty() {
        boolean result = DataChange.containRepeatNum(str3);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testGetNoSpaceString() {
        String expectedStr = ("1234");
        String result = DataChange.getNoSpaceString(str4);
        Assert.assertEquals(expectedStr, result);
    }

    @Test
    public void testGetStringwithSpace() {
        String expectedStr = ("1 2 3 4");
        String result = DataChange.getStringwithSpace(str5);
        Assert.assertEquals(expectedStr, result);
    }

}
