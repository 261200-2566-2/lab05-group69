class WarriorCharacter implements Warrior {
    private String name;
    private int level;
    private int health;

    public WarriorCharacter(String name, int level) {
        this.name = name;
        this.level = level;
        this.health = 100; // Starting health
    }

    public void displayCharacterInfo() {
        System.out.println("Warrior Character: " + name + ", Level: " + level + ", Health: " + health);
    }

    public void levelUp() {
        level++;
        health += 20; // Increase health when leveling up
    }

    public void useSlashAttack() {
        System.out.println(name + " performs a powerful slash attack!");
    }

    public void useShieldBlock() {
        System.out.println(name + " raises the shield to block incoming attacks!");
    }
}