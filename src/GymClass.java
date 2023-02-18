public class GymClass {
    private int leaderPokeHP;
    private int userPokeHP;
    private int hpLoss;
    private int hpGain;
    private int basicMove;
    private int mediumMove;
    private int advancedMove;
    private int healingMove;
    private String userMoveChoice;
    private String playAgain;
    private String letsBattle;
    private String gymLeader;
    private String leadersPokemon;
    private String[] LeadersPokeMoves;
    private String[] useLeaderMove;

    public String startBattle(String userDecision){
        this.letsBattle= userDecision.toLowerCase();
        if(letsBattle.equals("yes")){
            return "yes";
        } else if (letsBattle.equals("no")){
            return "Okay, play again when you are ready to battle!";
        } else {
            return "Please enter Yes or No next time to make a decision.";
        }
    }

    public void currentLeader(String leaderName, String Pokemon, String[] possibleAttacks){
        this.gymLeader = leaderName;
        this.leadersPokemon = Pokemon;
        this.LeadersPokeMoves = possibleAttacks;
        System.out.println(" ");
        System.out.println("Welcome to your elite three battle with gym leader " + gymLeader + "!");
        System.out.println(gymLeader + "'s Pokémon is " + leadersPokemon + ".");
        System.out.println(" ");
        System.out.println("Beware, " + leadersPokemon + " is powerful, " + leadersPokemon  + " has these moves: ");
            for(String battleMove : possibleAttacks){
                System.out.println(battleMove);
            }
        System.out.println(" ");
    }



    

    public static void main(String[] args){
    }
    
}
