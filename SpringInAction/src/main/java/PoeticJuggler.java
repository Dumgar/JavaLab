import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PoeticJuggler extends Juggler{
    private Poem poem;

    public PoeticJuggler(int beanbags, Poem poem) {
        super(beanbags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("While reciting... ");
        poem.recite();
    }
}
