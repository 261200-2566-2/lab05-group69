class MageCharacter implements Mage {
    private String name;
    private int level;

    public MageCharacter(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void displayCharacterInfo() {
        System.out.println("Mage Character: " + name + ", Level: " + level);
    }

    public void castSpell() {
        System.out.println(name + " casts a magical spell!");
    }
}
