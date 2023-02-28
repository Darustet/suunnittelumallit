package state;

public class PokemonContext {
   private PokemonState state;

   public PokemonContext(){
      state = null;
   }

   public void setState(PokemonState state){
      this.state = state;		
   }

   public PokemonState getState(){
      return state;
   }
}