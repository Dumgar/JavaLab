import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Juggler implements Performer {

    private int beanBags = 3;

    @Override
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
