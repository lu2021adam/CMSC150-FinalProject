import java.util.*;

public class PokeClass {
    private String pokeTrainer;
    private String[] starterPokemon;
    private String[] pokeAttacks;
    private String chosenPokemon;

    public String Trainer(String currentPlayer){
        this.pokeTrainer = currentPlayer;
        return this.pokeTrainer;
    }

    public void PokeString(String[] Pokemon){
        this.starterPokemon = Pokemon;
        for(String starter : starterPokemon){
            System.out.println(starter);
        }
        System.out.println(" ");
    }

    public void PokeAttacks(String[] starterMoves){
        this.pokeAttacks = starterMoves;
        for(String move : pokeAttacks){
            System.out.println(move);
        }
        System.out.println(" ");
    }


    public String PokeChoice(String userPokemon){
        this.chosenPokemon = userPokemon.toLowerCase();
        if(chosenPokemon.equals("bulbasaur") || chosenPokemon.equals("charmander") || chosenPokemon.equals("squirtle")){
            System.out.println("Congratulations! You chose " + chosenPokemon + " Good luck, and battle with heart!");
            System.out.println(" ");
            return this.chosenPokemon;
        } else {
            return "Please enter a valid pokemon or spell the Pokemons name correctly to play.";
        }
    }

    public static void main(String[] args){

    }
}
