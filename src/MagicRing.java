class MagicRing implements Ring {
    private String element;

    public MagicRing(String element) {
        this.element = element;
    }

    public void displayAccessoryInfo() {
        System.out.println("Magic Ring Element: " + element);
    }

    public void enhanceMagic() {
        System.out.println("The magic ring enhances the wearer's magical abilities!");
    }

    public void increaseManaRegeneration() {
        System.out.println("The magic ring increases mana regeneration!");
    }

    public void applyEffect(RPGCharacter character) {
        System.out.println("Magic ring's special effect applied: Elemental Infusion!");
    }
}