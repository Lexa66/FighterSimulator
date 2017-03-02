import java.util.Random;

public class Fighter {
    private String name;
    private int strength;
    private int ability;
    private int instinct;
    private int health;

    public Fighter(String name, int strength, int ability, int instinct, int health) {
        this.name = name;
        this.strength = strength;
        this.ability = ability;
        this.instinct = instinct;
        this.health = health;
    }

    public static Fighter createFighter(String name) {
        Random r = new Random();

        double str = r.nextInt(100);
        double ab = r.nextInt(100);
        double intuit = r.nextInt(100);

        double probability = (50 / (str + ab + intuit));

        int strength = (int) (str * probability);
        int ability = (int) (ab * probability);
        int instinct = (int) (intuit * probability);

        int health = 100;

        return new Fighter(name, strength, ability, instinct, health);
    }

    public void kick(Fighter fighter) {
        Random r = new Random();

        int damage = fighter.getInstinct() + fighter.getStrength();
        if (fighter.getAbility() > damage) {
            damage = r.nextInt(damage/2);
        }
        fighter.setHealth(fighter.getHealth() - damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public int getInstinct() {
        return instinct;
    }

    public void setInstinct(int instinct) {
        this.instinct = instinct;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
