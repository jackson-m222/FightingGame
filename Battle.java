public class Battle {
    private Fighter attacker;
    private Fighter defender;
    private int numRounds;
    private Fighter placeholder;

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

    public void takeTurn() {
        // attacker.dealDamage();
        int amount = attacker.dealDamage();
        defender.takeDamage(amount);
        numRounds++;
    }

    public int getNumRounds() {
        return numRounds;
    }

    public void swapFighters() {
        placeholder = attacker;
        attacker = defender;
        defender = placeholder;
    }

    public void printRoundUpdate() {
        System.out.println("Round " + numRounds);
        System.out.println(attacker.getName() + ": " + attacker.getHealthPoints() + "   " + defender.getName() + ": " + defender.getHealthPoints());
    }
}