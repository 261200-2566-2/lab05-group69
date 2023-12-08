class MageCharacter implements Mage {
    private String name;
    private int level;
    private int experiencePoints;
    private int mana;

    public MageCharacter(String name, int level) {
        this.name = name;
        this.level = level;
        this.experiencePoints = 0;
        this.mana = 100; // Starting mana
    }

    public void displayCharacterInfo() {
        System.out.println("Mage Character: " + name + ", Level: " + level + ", Experience: " + experiencePoints + ", Mana: " + mana);
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
        // Mages might have a different damage calculation due to magical resistance
        int actualDamage = damage / 2; // For example, mages take only half the physical damage
        mana -= actualDamage;
        System.out.println(name + " took " + actualDamage + " magical damage!");
    }

    public boolean isAlive() {
        return mana > 0;
    }

    public void castSpell() {
        System.out.println(name + " casts a magical spell!");
    }

    public void useMageAbility() {
        System.out.println(name + " uses a special mage ability: Arcane Surge!");
    }
}