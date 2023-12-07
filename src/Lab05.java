public class Lab05 {
    public static void main(String[] args) {
        // Create a Warrior character
        WarriorCharacter warrior = new WarriorCharacter();
        warrior.displayCharacterInfo();
        warrior.useSlashAttack();

        // Create a Mage character
        MageCharacter mage = new MageCharacter();
        mage.displayCharacterInfo();
        mage.castFireball();

        // Create a Gauntlet accessory
        IronGauntlet ironGauntlet = new IronGauntlet();
        ironGauntlet.displayAccessoryInfo();
        ironGauntlet.provideStrengthBuff();

        // Create a Ring accessory
        MagicRing magicRing = new MagicRing();
        magicRing.displayAccessoryInfo();
        magicRing.provideMagicBuff();
    }
}