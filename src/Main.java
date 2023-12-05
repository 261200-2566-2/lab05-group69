public class Main {
    public static void main(String[] args) {
        // Create RPG characters and accessories
        WarriorCharacter warrior = new WarriorCharacter();
        MageCharacter mage = new MageCharacter();
        IronGauntlet ironGauntlet = new IronGauntlet();
        MagicRing magicRing = new MagicRing();

        // Demonstrate interactions
        warrior.displayCharacterInfo();
        warrior.useSlashAttack();

        mage.displayCharacterInfo();
        mage.castFireball();

        ironGauntlet.displayAccessoryInfo();
        ironGauntlet.provideStrengthBuff();

        magicRing.displayAccessoryInfo();
        magicRing.provideMagicBuff();
    }
}
