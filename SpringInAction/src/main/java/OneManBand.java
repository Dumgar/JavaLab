import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Map;

@Data
@NoArgsConstructor
public class OneManBand implements Performer {
    private Map<String, Instrument> instruments;

    @Override
    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
