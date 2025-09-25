/**
 * This class makes the fighters and their stats
 * The stats both the fighters get is a name, health pool and maximum damage and heal output
 * It also makes amount healed and damage random based on the max
 */
import java.util.Random;

public class Fighter {

    private String name;
    private int healthPoints;
    private int attackDamage;
    private int damageDealt;
    private Random rng;
    private int healAmount;
    private int healthHealed;

    /**
     * Constructor that creates the fighter and gives it it's stats
     */
    public Fighter() {
        name = "Bobby";
        healthPoints = 100;
        attackDamage = 30;
        rng = new Random();
        healAmount = 15;
    }

    /**
     * Method that creates the 2nd fighter in the main class
     * @param name1 Name of the fighter
     * @param health1 Health of the fighter
     * @param dmg1 Maximum damage output of the fighter
     * @param heal1 Maximum heal input of the fighter
     */
    public Fighter(String name1, int health1, int dmg1, int heal1) {
        name = name1;
        healthPoints = health1;
        attackDamage = dmg1;
        rng = new Random();
        healAmount = heal1;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getHealAmount() {
        return healAmount;
    }

    /**
     * Method that lets the fighters deal damage
     * Damage is based on a random number 1 through their maximum damage output
     * Subtracts the damage they dealt from their enemy's health
     * @return
     */
    public int dealDamage() {
        damageDealt = rng.nextInt(attackDamage) + 1;
        System.out.println(" ");
        System.out.println(name + " deals " + damageDealt + " damage.");
        return damageDealt;
    }

    /**
     * Method that subtracts the damage the enemy afflicted from the fighter's health
     * Also prints how much health they have remaining after the attack
     * @param amount
     */
    public void takeDamage(int amount) {
        healthPoints = healthPoints - amount;
        System.out.println(" ");
        System.out.println(name + " was attacked. Now has " + healthPoints + " health.");
        System.out.println(" ");
    }

    /**
     * Method that lets the fighter heal rather than attacking
     * Health healed is based on a random number from 1 through the maximum health input
     * Adds the health healed to their own health pool.
     * @return
     */
    public int heal() {
        healthHealed = rng.nextInt(healAmount);
        healthPoints = healthPoints + healthHealed;
        System.out.println(name + " healed " + healthHealed + " health. Now has " + healthPoints + " health");
        System.out.println(" ");
        return healthHealed;
    }

    /**
     * Method that announces the fighters stats when the game begins.
     */
    public String toString() {
        return name + " has " + healthPoints + " health, can deal 30 damage, and can heal 15.";
    }
}