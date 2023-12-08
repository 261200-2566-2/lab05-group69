class MageCharacter implements Mage {
    private String name;
    private int level;
    private int mana;

    public MageCharacter(String name, int level) {
        this.name = name;
        this.level = level;
        this.mana = 100; // Starting mana
    }

    public void displayCharacterInfo() {
        System.out.println("Mage Character: " + name + ", Level: " + level + ", Mana: " + mana);
    }

    public void levelUp() {
        level++;
        mana += 30; // Increase mana when leveling up
    }

    public void castSpell() {
        System.out.println(name + " casts a magical spell!");
    }

    public void meditate() {
        System.out.println(name + " meditates to restore mana!");
        mana += 10;
    }
}