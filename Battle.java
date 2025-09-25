/**
 * This class creates the commands for the battle to actually run
 */
import java.util.Scanner;

public class Battle {
    private Fighter attacker;
    private Fighter defender;
    private int numRounds;
    private Fighter placeholder;
    private boolean battleOver = false;

    Scanner scan = new Scanner(System.in);
    /**
     * Constructor that assigns the fighters who's turn it is to attack
     * @param fighter1 Player 1
     * @param fighter2 Player 2
     */
    public Battle(Fighter fighter1, Fighter fighter2) {
        attacker = fighter1;
        defender = fighter2;
        numRounds = 0;
    }

    public Fighter getAttacker() {
        return attacker;
    }

    public Fighter getDefender() {
        return defender;
    }

    /**
     * Everything that lets the player use their turn from healing, attacking or nothing
     */
    public void takeTurn() {
        System.out.println(attacker.getName() + ", would you like to attack or heal?: ");
        String choice = scan.nextLine();
        choice = choice.toLowerCase();
        if (choice.equals("attack")) {
            int amount = attacker.dealDamage();
            defender.takeDamage(amount);
            if (defender.getHealthPoints() <= 0) {
                battleOver = true;
            }
        }
        else if (choice.equals("heal")) {
            attacker.heal();
        }
        else {
            System.out.println(" ");
            System.out.println(attacker.getName() + " apparently forgot what they were doing so just stood there");
            System.out.println("(Hey goober. You only have 2 options, it's either 'Attack' or 'Heal')");
            System.out.println(" ");
        }
        numRounds++;
    }

    /**
     * Message that signals that the game has started and the announces the names of the two fighters
     */
    public void printStartInfo() {
        System.out.println("Welcome to a fight between " + attacker.getName() + " and " + defender.getName() + "!" );
        System.out.println(attacker);
        System.out.println(defender);
        System.out.println(" ");
    }

    public int getNumRounds() {
        return numRounds;
    }

    /**
     * Swaps the turn of the two fighters after a round has concluded. 
     * The placeholder is here so both players don't have the same tags.
     */
    public void swapFighters() {
        placeholder = attacker;
        attacker = defender;
        defender = placeholder;
    }

    /**
     * Message that prints after a round ends
     * Updates the users on the fighters health and which round they are on
     */
    public void printRoundUpdate() {
        System.out.println("Round " + numRounds);
        System.out.println("-------");
        System.out.println(attacker.getName() + ": " + attacker.getHealthPoints() + "   " + defender.getName() + ": " + defender.getHealthPoints());

    }

    /**
     * Announces that the game has ended
     * Decides which fighter won based on how much health each fighter had at the end
     * The fighter with more health wins
     */
    public void printEndInfo() {
        System.out.println("Battle Over!");
        System.out.println(attacker.getName() + ": " + attacker.getHealthPoints() + "     " + defender.getName() + ": " + defender.getHealthPoints());
        // Decides who wins based on health remaining
        if (attacker.getHealthPoints() > defender.getHealthPoints()) {
            System.out.println(attacker.getName() + " wins!");
        }
        else if (attacker.getHealthPoints() < defender.getHealthPoints()) {
            System.out.println(defender.getName() + " wins!");
        }
        else {
            System.out.println("Tie!");
        }
    }

    public boolean getBattleOverStatus() {
        return battleOver;
    }
}