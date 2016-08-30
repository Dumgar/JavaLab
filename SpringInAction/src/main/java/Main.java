import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

        Performer performer = (Performer) ctx.getBean("hank");
        performer.perform();
    }
}
