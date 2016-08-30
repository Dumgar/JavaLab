import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("GREAM GREAM GREAM");
    }
}
