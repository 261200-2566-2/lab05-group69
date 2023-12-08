class MagicRing implements Ring {
    private String element;
    private int enchantmentLevel;

    public MagicRing(String element) {
        this.element = element;
        this.enchantmentLevel = 1; // Starting enchantment level
    }

    public void displayAccessoryInfo() {
        System.out.println("Magic Ring Element: " + element + ", Enchantment Level: " + enchantmentLevel);
    }

    public void enhanceMagic() {
        System.out.println("The magic ring enhances the wearer's magical abilities!");
    }

    public void increaseManaRegeneration() {
        System.out.println("The magic ring increases mana regeneration!");
    }
}