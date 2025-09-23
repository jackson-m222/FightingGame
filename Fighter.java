
/**
 * Write a description of class Fighter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fighter
{
    private String name;
    private int healthPoints;
    private int attackDamage;

    public Fighter() {
        name = "Bobby";
        healthPoints = 100;
        attackDamage = 30;
    }

    public Fighter(String name1, int health1, int dmg1) {
        name = name1;
        healthPoints = health1;
        attackDamage = dmg1;
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

    public int dealDamage() {
        System.out.println(name + " deals " + attackDamage + " damage.");
        return attackDamage;
    }

    public void takeDamage(int amount) {
        healthPoints = healthPoints - amount;
        System.out.println(name + " was attacked. Now has " + healthPoints + " health.");
    }
}
