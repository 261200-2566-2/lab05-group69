class WarriorCharacter implements Warrior {
    private String name;
    private int level;

    public WarriorCharacter(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void displayCharacterInfo() {
        System.out.println("Warrior Character: " + name + ", Level: " + level);
    }

    public void useSlashAttack() {
        System.out.println(name + " performs a powerful slash attack!");
    }
}