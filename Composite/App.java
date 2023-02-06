public class App {
    public static void main(String[] args) {
        Komponentti muistipiiri = new Komponentti(100);
        Komponentti prosessori = new Komponentti(350);
        Komponentti verkkokortti = new Komponentti(110);
        Komponentti naytonohjain = new Komponentti(1100);

        Koostekomponentti emolevy = new Koostekomponentti(290);
        emolevy.lisaa(muistipiiri);
        emolevy.lisaa(prosessori);
        emolevy.lisaa(verkkokortti);
        emolevy.lisaa(naytonohjain);

        Koostekomponentti kotelo = new Koostekomponentti(150);
        kotelo.lisaa(emolevy);

        System.out.println("Tietokoneen hinta " + kotelo.hinta() + "€");
    }
}
