class WarriorCharacter implements Warrior {
    private String name;
    private int level;
    private int experiencePoints;
    private int health;

    public WarriorCharacter(String name, int level) {
        this.name = name;
        this.level = level;
        this.experiencePoints = 0;
        this.health = 100; // Starting health
    }

    public void displayCharacterInfo() {
        System.out.println("Warrior Character: " + name + ", Level: " + level + ", Experience: " + experiencePoints + ", Health: " + health);
    }

    public void levelUp() {
        level++;
        System.out.println(name + " leveled up to level " + level + "!");
    }

    public void gainExperience(int experiencePoints) {
        this.experiencePoints += experiencePoints;
        System.out.println(name + " gained " + experiencePoints + " experience points!");
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage!");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void useSlashAttack() {
        System.out.println(name + " performs a powerful slash attack!");
    }

    public void useWarriorAbility() {
        System.out.println(name + " uses a special warrior ability: Crushing Blow!");
    }
}//