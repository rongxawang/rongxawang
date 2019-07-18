package NumberOff;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class JudgementTest {
    private Judgement judgement = new Judgement();

    @Test
    public void should_return_true_when_number_is_3()
    {
        assertTrue(judgement.judgeMultipleOf3(3));
    }

    @Test
    public void should_return_true_when_number_is_5()
    {
        assertTrue(judgement.judgeMultipleOf3(5));
    }
    @Test
    public void should_return_true_when_number_is_7()
    {
        assertTrue(judgement.judgeMultipleOf3(7));
    }

    @Test
    public void should_return_true_when_number_is_105()
    {
        assertTrue(judgement.judgeMultipleOf3(105)&&judgement.judgeMultipleOf3(105)&&judgement.judgeMultipleOf3(105));
    }

    @Test
    public void should_return_true_when_number_is_15()
    {
        assertTrue(judgement.judgeMultipleOf3(15)&&judgement.judgeMultipleOf5(15));
    }

}
