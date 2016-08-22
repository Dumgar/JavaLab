import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

public class CalcTest {
    private String[] args = {"1", "-", "4"};
    private List resultList = Arrays.asList(1, 1, 4);


    //Сначала я написал этот тест
    @Test
    public void testCalc(){
        double result = Calc.calc(args);
        assertThat(result, is(-3.0));
    }

    //Потом этот
    @Test
    public void testParse() {
        List parseExp = Calc.parse(args);
        assertThat(parseExp, is(resultList));
    }

    //А потом все эти зараз, потому что они не зависят от операции, операции нам нужны только в calc
    @Test
    public void testSum(){
        int result = Calc.sum(resultList);
        assertThat(result, is(5));
    }

    @Test
    public void testSub(){
        int result = Calc.sub(resultList);
        assertThat(result, is(-3));
    }

    @Test
    public void testMtpl(){
        int result = Calc.mtpl(resultList);
        assertThat(result, is(4));
    }

    @Test
    public void testDiv(){
        double result = Calc.div(resultList);
        assertThat(result, is(0.25));
    }

}
