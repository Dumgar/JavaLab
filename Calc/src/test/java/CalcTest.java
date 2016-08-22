import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

/**
 * Created by romandmitriev on 22.08.16.
 */
public class CalcTest {

    @Test
    public void testSum(){
        int c = Calc.sum(2, 3);
        assertThat(c, is(5));
    }

    @Test
    public void testDiv(){
        int c = Calc.div(6, 2);
        assertThat(c, is(3));
    }

    @Test
    public void testSub(){
        int c = Calc.sub(6, 4);
        assertThat(c, is(2));
    }

    @Test
    public void testMtpl(){
        int c = Calc.mtpl(2, 3);
        assertThat(c, is(6));
    }

    @Test
    public void testParse() {
        List<String> string =  Arrays.asList("2", "+", "4");
        List<Integer> c = Calc.parse(string);
        List<Integer> result = Arrays.asList(2,4,0);
        assertThat(c, is(result));
    }

    @Test
    public void testCalculate(){
        String[] args = {"2," "1"};

        assertThat(Calc.calculate(args), 3);
    }

}
