import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT  ");
    }
}
