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
            gameMaterials.introduction();
            gameMaterials.chooseStarterPokemon();
            String pokemonChoice = userInput.nextLine();
            PokeClass userPokemon = new PokeClass(pokemonChoice);
            String pokemonResult = userPokemon.starterSelected();
            if(pokemonResult.equals(userPokemon.getPokemon())){
                String darkGymOutcome = darkGym(userPokemon);
                if(darkGymOutcome.equals("Okay, play again when you are ready to battle!") || darkGymOutcome.equals("Please enter Yes or No to continue next time.")){
                    System.out.println(darkGymOutcome);
                    break;
                } else if (darkGymOutcome.equals("Congrats, you won! You recieved the Darkness Badge from Cristian!")){
                    System.out.println(darkGymOutcome);
                    System.out.println(" ");
                    if(userPokemon.getPokemon().equals("squirtle")){
                        System.out.println(" ");
                        System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String squirtleEvolution = "wartortle";
                        userPokemon.setPokemon(squirtleEvolution);
                        System.out.println("Congratulations! your squirtle evolved into " + userPokemon.getPokemon() + "!" );
                        System.out.println(userPokemon.getPokemon() + " forgot how to use tackle and learned HydroPump!");
                        System.out.println(" ");
                        System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                        userPokemon.currentPokeMoves();
                        System.out.println(" ");
                        break;
                    } else if(userPokemon.getPokemon().equals("charmander")){
                        System.out.println(" ");
                        System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String charmanderEvolution = "charmeleon";
                        userPokemon.setPokemon(charmanderEvolution);
                        System.out.println("Congratulations! your charmander evolved into " + userPokemon.getPokemon() + "!" );
                        System.out.println(userPokemon.getPokemon() + " forgot how to use tackle and learned DragonPulse!");
                        System.out.println(" ");
                        System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                        userPokemon.currentPokeMoves();
                        System.out.println(" ");
                        break;
                    } else if (userPokemon.getPokemon().equals("bulbasaur")){
                        System.out.println(" ");
                        System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String bulbasaurEvolution = "ivysaur";
                        userPokemon.setPokemon(bulbasaurEvolution);
                        System.out.println("Congratulations! your bulbasaur evolved into " + userPokemon.getPokemon() + "!" );
                        System.out.println(userPokemon.getPokemon() + " forgot how to use tackle and learned FlowerPower!");
                        System.out.println(" ");
                        System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                        userPokemon.currentPokeMoves();
                        System.out.println(" ");
                        break;
                    } else {
                        System.out.println("Something went wrong, this should never print!");
                        break;
                    }
                } else if (darkGymOutcome.equals("You were no match for the gym leader. Better luck next time.")){
                    System.out.println(darkGymOutcome);
                    break;
                }
            } else{
                System.out.println(pokemonResult);
                break;
            }
        } else {
            System.out.println("Please enter a valid form of Yes or No.");
        }
        }
    }

    public static String darkGym(PokeClass userPokemon){
        String[] darkraiPossibleMoves = {"PlasmaBall", "ShadowHunter", "Nightmare"};
        Scanner userInput = new Scanner(System.in);
        Random pokeHP = new Random();
        System.out.println("Welcome to your first battle with the elite three!");
        System.out.println("Before you begin, let me introduce you to " + userPokemon.getPokemon() + "'s current battle moves:");
        System.out.println(" ");
        userPokemon.currentPokeMoves();
        System.out.println("Would you like to start the battle (Yes or No)?");
        String battleTime = userInput.nextLine();
        String lowerBattleTime = battleTime.toLowerCase();
        if(lowerBattleTime.equals("no")){
            return "Okay, play again when you are ready to battle!";
        } else if (lowerBattleTime.equals("yes")){
            System.out.println(" ");
            int darkraiHealth = pokeHP.nextInt(50,120);
            int usersPokemonHealth = pokeHP.nextInt(50,99);
            String gymLeader = "Cristian";
            String leadersPokemon = "Darkrai";
            PokeClass darkPokemon = new PokeClass(leadersPokemon);
            BattleClass userBattler = new BattleClass(usersPokemonHealth, userPokemon.getPokemon());
            BattleClass darkraiBattler = new BattleClass(darkraiHealth, leadersPokemon.toLowerCase());
            System.out.println("Hello, my name is " + gymLeader + ", I am the leader of the dark type gym for the Elite Three!");
            System.out.println("My Pokemon is " + leadersPokemon + ". Good luck in battle, you will certainly need it!");
            System.out.println(" ");
            System.out.println("Beware, " + leadersPokemon + " is powerful, he has these moves: ");
            darkPokemon.currentPokeMoves();
            while(userBattler.getHP() >= 0 && darkraiBattler.getHP() >= 0){
                System.out.println("Your Moves: ");
                userPokemon.currentPokeMoves();
                System.out.println(userBattler.getPokemon() + "'s current Health is: " + userBattler.getHP());
                System.out.println(darkraiBattler.getPokemon() + "'s Pokemon's current health is: " + darkraiBattler.getHP());
                System.out.println(" ");
                for(int i = 0; i < 2; i++){
                    if(i == 0){
                        System.out.println("What battle move would you like to use?");
                        String pickAttack = userInput.nextLine();
                        System.out.println(" ");
                        userBattler.userAttack(darkraiBattler, pickAttack);
                    }
                    if(i == 1){
                        String moveChoice = darkraiPossibleMoves[(int) (Math.random() * darkraiPossibleMoves.length)];
                        System.out.println(" ");
                        darkraiBattler.leaderAttack(userBattler, moveChoice);
                        System.out.println(" ");
                    }
                }
                if(userBattler.getHP() <= 0) {
                    return "You were no match for the gym leader. Better luck next time.";
                } 
                if (darkraiBattler.getHP() <= 0){
                    return "Congrats, you won! You recieved the Darkness Badge from Cristian!";
                }
                System.out.println("This turn has ended, both Pokemon still have health remaining. The next turn begins now!");
                System.out.println(" ");
            } 
        } else {
            return "Please enter Yes or No to continue next time.";
        }
    return "This is for Java to be satisfied. It will never return";
    }

//    public static String fireGym(){
//        String [] arcaninePossibleMoves = {"FireFang", "Bite", "ExtremeHeal"};
//    }

//    public static String grandMaster(){
//        String [] arceusPossibleMoves = {"HyperBeam", "CosmicPower", "PerishSong"};
//    }


    public static void main(String [] args){
    gameOn();
    }
}
