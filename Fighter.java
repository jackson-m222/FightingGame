import java.util.Random;

public class Fighter {
    private String name;
    private int healthPoints;
    private int attackDamage;
    private int damageDealt;
    private Random rng;
    private int healAmount;
    private int healthHealed;

    public Fighter() {
        name = "Bobby";
        healthPoints = 100;
        attackDamage = 30;
        rng = new Random();
        healAmount = 15;
    }

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

    public int dealDamage() {
        damageDealt = rng.nextInt(attackDamage) + 1;
        System.out.println(" ");
        System.out.println(name + " deals " + damageDealt + " damage.");
        return damageDealt;
    }

    public void takeDamage(int amount) {
        healthPoints = healthPoints - amount;
        System.out.println(" ");
        System.out.println(name + " was attacked. Now has " + healthPoints + " health.");
        System.out.println(" ");
    }

    public int heal() {
        healthHealed = rng.nextInt(healAmount);
        healthPoints = healthPoints + healthHealed;
        System.out.println(name + " healed " + healthHealed + " health. Now has " + healthPoints + " health");
        System.out.println(" ");
        return healthHealed;
    }

    public String toString() {
        return name + " has " + healthPoints + " health, can deal 30 damage, and can heal 15.";
    }
}
