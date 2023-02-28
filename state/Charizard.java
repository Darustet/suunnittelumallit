package state;

public class Charizard implements PokemonState {

    public void doAction(PokemonContext context) {
        System.out.println("");
        System.out.println("A wild Charizard appeared!");
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
        System.out.println("Charizard roars: *Räyh!*");
    }

    public void breatheFire() {
        System.out.println("Charizard breathes fire: house is on fire!");
    }

    public void eat() {
        System.out.println("Charizard eats Chili the Gym Leader");
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
}
