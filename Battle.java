
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    private Fighter attacker;
    private Fighter defender;

    public Battle(Fighter fighter1, Fighter fighter2) {
        attacker = fighter1;
        defender = fighter2;
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
    }
}
