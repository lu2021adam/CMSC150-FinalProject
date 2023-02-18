import java.util.*;

public class PokeGame {
    public static void gameOn(){
        Scanner userInput = new Scanner(System.in);
        while(true){
        System.out.println(" ");
        System.out.println("Welcome to Pokemon Lawrentian! Would you like an introduction to how battling works (Yes or No)? This is Recommended for first time players.");
        String tutorial = userInput.nextLine();
        String lowerTutorial = tutorial.toLowerCase();
        if(lowerTutorial.equals("yes")){
            String userTutorial = gameMaterials.tutorial();
            System.out.println(userTutorial);
            System.out.println(" ");
        } else if (lowerTutorial.equals("no")) {
            PokeClass usePokeClass = new PokeClass();
            GymClass useGymClass = new GymClass();
            gameMaterials.profBruceIntro();
            String usersName = userInput.nextLine();
            String currentTrainer = usePokeClass.Trainer(usersName);
            gameMaterials.profBruceP2(currentTrainer);
            String[] starterPokemon = {"Bulbasaur", "Charmander", "Squirtle"};
            System.out.println("Please select one of these Pokémon: ");
            usePokeClass.PokeString(starterPokemon);
            String userPokemon = userInput.nextLine();
            String printPokeChoice = usePokeClass.PokeChoice(userPokemon);
            if(printPokeChoice.equals("charmander") || printPokeChoice.equals("squirtle") || printPokeChoice.equals("bulbasaur")){
                System.out.println("Welcome to your first battle with the elite three!");
                System.out.println("Before you begin, allow me to introduce you to " + printPokeChoice + "'s current battle moves");
                String[] charmanderMoves = {"Scratch (M)", "FlameThrower (A)", "Tackle (B)"};
                String[] bulbasaurMoves = {"TailWhip (M)", "LeafBlade (A)", "Tackle (B)"};
                String[] squirtleMoves = {"Heal (H)", "WaterGun (A)", "Tackle (B)"};
                if(printPokeChoice.equals("charmander")){
                    usePokeClass.PokeAttacks(charmanderMoves);
                } else if(printPokeChoice.equals("squirtle")){
                    usePokeClass.PokeAttacks(squirtleMoves);
                } else{
                    usePokeClass.PokeAttacks(bulbasaurMoves);
                }
                System.out.println("Would you like to start the battle (Yes or No)?");
                String battleDecision = userInput.nextLine();
                String finalDecision = useGymClass.startBattle(battleDecision);
                if(finalDecision.equals("yes")){
                    String[] darkraiMoves = {"PlasmaBall (A)", "ShadowHunter (A)", "Nightmare (M)"};
                    String[] darkraiPossibleMoves = {"PlasmaBall", "ShadowHunter", "Nightmare"};
                    String darkLeader = "Cristian";
                    String darkPokemon = "Darkrai";
                    useGymClass.currentLeader(darkLeader, darkPokemon, darkraiMoves);
                    break;
                } else {
                    System.out.println(finalDecision);
                    break;
                } 
            } else {
                System.out.println(printPokeChoice);
                break;
            }  
        } else {
            System.out.println("Please enter either yes or no next time to play the game.");
            break;
        }
        }
    }

    
        public static void main(String [] args){
        gameOn();
        }
}
