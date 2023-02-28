package state;

public class Charmeleon implements PokemonState {

    public void doAction(PokemonContext context) {
        System.out.println("");
        System.out.println("A wild Charmeleon appeared!");
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
        System.out.println("Charmeleon screams *Krääk!*");
    }

    public void breatheFire() {
        System.out.println("Charmeleon breathes fire: campfire ignites");
    }

    public void eat() {
        System.out.println("Charmeleon eats a chorizo");
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
}
