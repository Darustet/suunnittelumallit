public class Komponentti implements Laiteosa{

    private int hinta;

    public Komponentti(int hinta) {
        this.hinta = hinta;
    }

    @Override
    public int hinta() {
        return hinta;
    }
}