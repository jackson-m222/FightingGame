import java.util.Scanner;

public class Battle {
    private Fighter attacker;
    private Fighter defender;
    private int numRounds;
    private Scanner scan; 
    public Battle(Fighter fighter1, Fighter fighter2) {
        attacker = fighter1;
        defender = fighter2;
        numRounds = 0;
        scan = new Scanner(System.in);
    }

    public Fighter getAttacker() {
        return attacker;
    }

    public Fighter getDefender() {
        return defender;
    }

    public void takeTurn() {
        
        System.out.println(attacker.getName() + ", would you like to attack or heal?: ");
        String choice = scan.nextLine();
        choice = choice.toLowerCase();
        if (choice.equals("attack")) {
            int amount = attacker.dealDamage();
            defender.takeDamage(amount);
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

    public void printStartInfo() {
        System.out.println("Welcome to a fight between " + attacker.getName() + " and " + defender.getName() + "!" );
        System.out.println(attacker);
        System.out.println(defender);
        System.out.println(" ");
    }

    public int getNumRounds() {
        return numRounds;
    }

    public void swapFighters() {
        Fighter placeholder = attacker;
        attacker = defender;
        defender = placeholder;
    }

    public void printRoundUpdate() {
        System.out.println("Round " + numRounds);
        System.out.println("-------");
        System.out.println(attacker.getName() + ": " + attacker.getHealthPoints() + "   " + defender.getName() + ": " + defender.getHealthPoints());

    }


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
}