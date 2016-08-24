import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

@RunWith(Parameterized.class)
public class CalcTest {

    private List<Integer> resultList; //поставил у списков дженерики, а так норм :)
    private double result;
    private String[] args;

    @Parameterized.Parameters(name = "{index}: First num: {0}, Operator: {1}, Second num: {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1", "-", "4", -3.0, Arrays.asList(1, 1, 4)},
                {"6", "+", "2", 8.0, Arrays.asList(6, 0, 2)}
        });
    }

    public CalcTest(String firstNum, String oper, String secondNum, double result, List<Integer> resultList) {
        this.result = result;
        this.args = new String[]{firstNum, oper, secondNum};
        this.resultList = resultList;
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
}
