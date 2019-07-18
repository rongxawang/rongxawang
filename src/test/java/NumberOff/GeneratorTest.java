package NumberOff;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class GeneratorTest {
    private Generator generator = new Generator();

    @Test
    public void should_return_120_when_generated()
    {
        Integer[] result = generator.generate();
        assertThat(result.length,is(120));
    }
}
