import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

@RunWith(Parameterized.class)
public class CalcTest {
    private List<Integer> resultList = Arrays.asList(1, 1, 4); //поставил у списков дженерики, а так норм :)


    @Parameterized.Parameters(name = "{index}: First num: {0}, Operator: {1}, Second num: {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1", "-", "4", -3.0},
                {"6", "+", "2", 8.0}
        });
    }

    private String firstNum;
    private String oper;
    private String secondNum;
    private double result;
    private String[] args;

    public CalcTest(String firstNum, String oper, String secondNum, double result) {
        this.firstNum = firstNum;
        this.oper = oper;
        this.secondNum = secondNum;
        this.result = result;
        this.args = new String[]{firstNum, oper, secondNum};
    }

    //Сначала я написал этот тест
    @Test
    public void testCalc() {
        assertThat(Calc.calc(args), is(result));
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
