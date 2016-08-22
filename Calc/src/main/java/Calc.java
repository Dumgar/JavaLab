import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by romandmitriev on 22.08.16.
 */
public class Calc {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mtpl(int a, int b) {
        return a * b;
    }

    public static List<Integer> parse(List<String> string) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(string.get(0)));
        list.add(Integer.parseInt(string.get(2)));

        switch (string.get(1)) {
            case ("+"):
                list.add(0);
                break;
            case ("/"):
                list.add(1);
                break;
            case ("-"):
                list.add(2);
                break;
            case ("*"):
                list.add(3);
                break;
        }

        return list;
    }


    public static int calculate(String[] args) {


        List<Integer> parse = parse(Arrays.asList(args));




    }
}
