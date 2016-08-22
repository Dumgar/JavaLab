import java.util.ArrayList;
import java.util.List;

public class Calc {
    static double calc(String[] exp) {
        List<Integer> list = parse(exp);
        switch (list.get(1)){
            case (0):
                return sum(list);
            case (1):
                return sub(list);
            case (2):
                return mtpl(list);
            case (3):
                return div(list);
            default:
                return 0;
        }
    }

    static List<Integer> parse(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(args[0]));

        switch (args[1]) {
            case ("+"):
                list.add(0);
                break;
            case ("-"):
                list.add(1);
                break;
            case ("*"):
                list.add(2);
                break;
            case ("/"):
                list.add(3);
                break;
        }

        list.add(Integer.parseInt(args[2]));

        return list;
    }

    static int sum(List<Integer> list) {
        return list.get(0) + list.get(2);
    }

    static int sub(List<Integer> list) {
        return list.get(0) - list.get(2);
    }

    static int mtpl(List<Integer> list) {
        return list.get(0) * list.get(2);
    }

    static double div(List<Integer> list) {
        return (double)list.get(0) / list.get(2);
    }
}
