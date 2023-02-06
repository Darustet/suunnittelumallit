import java.util.List;
import java.util.ArrayList;

public class Koostekomponentti implements Laiteosa{
    
    private int hinta;
    private final List<Laiteosa> komponentit = new ArrayList<>();

    public Koostekomponentti(int hinta) {
        this.hinta = hinta;
    }

    public void lisaa(Laiteosa laiteosa) {
        komponentit.add(laiteosa);
    }

    public int hinta() {
        for (Laiteosa komponentti : komponentit) {
            hinta += komponentti.hinta();
        }
        return hinta;
    }
}
