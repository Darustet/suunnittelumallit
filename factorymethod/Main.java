package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus vierailija = new Vierailija();
        opettaja.aterioi();
        opiskelija.aterioi();
        vierailija.aterioi();
    }
}
