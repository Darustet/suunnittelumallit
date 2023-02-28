package state;

public interface PokemonState {
    public void doAction(PokemonContext context);
    public void roar();
    public void breatheFire();
    public void eat();   
}
