import java.util.Scanner;
import java.util.Random;

public class Fighter {
    private String name;
    private int healthPoints;
    private int attackDamage;
    private Random rng;

    public Fighter() {
        name = "Bobby";
        healthPoints = 100;
        attackDamage = 30;
        rng = new Random();
    }

    public Fighter(String name1, int health1, int dmg1) {
        name = name1;
        healthPoints = health1;
        attackDamage = dmg1;
        rng = new Random();
    }

    public int getDamage() {
        return attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int dealDamage() {
        attackDamage = rng.nextInt(attackDamage) + 1;
        System.out.println(name + " deals " + attackDamage + " damage.");
        return attackDamage;
    }

    public void takeDamage(int amount) {
        healthPoints = healthPoints - amount;
        System.out.println(name + " was attacked. Now has " + healthPoints + " health.");
    }
}