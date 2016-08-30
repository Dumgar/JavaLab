import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String screamSong() {
        return song;
    }
    @Override
    public void perform() {
        System.out.println("Playing " + song + ":");
        instrument.play();
    }
}
