package factorymethod;

public class Vierailija extends AterioivaOtus {
    
    public Juoma createJuoma() {
        return new Maito();
    };
}
