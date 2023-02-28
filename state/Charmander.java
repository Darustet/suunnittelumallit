package state;

public class Charmander implements PokemonState {

    public void doAction(PokemonContext context) {
        System.out.println("");
        System.out.println("A wild Charmander appeared!");
        context.setState(this);	

        sleep(1000);
        roar();
        sleep(1000);
        breatheFire();
        sleep(1000);
        eat();
        sleep(1000);
    }

    public void roar() {
        System.out.println("Charmander yells: *Piip!*");
    }

    public void breatheFire() {
        System.out.println("Charmander breathes fire: candle is lit.");
    }

    public void eat() {
        System.out.println("Charmander ate a chili.");
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
}
