import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InnerTest {

    private List<Integer> resultList = Arrays.asList(1, 1, 4);

    @Test
    public void testSum() {
        int result = Calc.sum(resultList);
        assertThat(result, is(5));
    }

    @Test
    public void testSub() {
        int result = Calc.sub(resultList);
        assertThat(result, is(-3));
    }

    @Test
    public void testMtpl() {
        int result = Calc.mtpl(resultList);
        assertThat(result, is(4));
    }

    @Test
    public void testDiv() {
        double result = Calc.div(resultList);
        assertThat(result, is(0.25));
    }
}
