import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

public class CalcTest {
    private String[] args = {"1", "-", "4"};
    private List<Integer> resultList = Arrays.asList(1, 1, 4); //поставил у списков дженерики, а так норм :)


    //Сначала я написал этот тест
    @Test
    public void testCalc() {
        double result = Calc.calc(args);
        assertThat(result, is(-3.0));
    }

    // на случай, если аргументов метода main нет или их больше 3, пусть возваращает 0 как в твоем свитче,
    // когда нужный оператор не найден
    @Test
    public void testCalc2() {
        double result = Calc.calc(new String[0]);
        assertThat(result, is(0.0));
    }

    //Потом этот
    @Test
    public void testParse() {
        List<Integer> parseExp = Calc.parse(args);
        assertThat(parseExp, is(resultList));
    }

    //А потом все эти зараз, потому что они не зависят от операции, операции нам нужны только в calc
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
