package state;

public class Main {
    public static void main(String[] args) {
        PokemonContext context = new PokemonContext();
  
        Charmander charmander = new Charmander();
        Charmeleon charmeleon = new Charmeleon();
        Charizard charizard = new Charizard();

        while (true) {
            charmander.doAction(context);    
            charmeleon.doAction(context);     
            charizard.doAction(context);
        }
    }
}
