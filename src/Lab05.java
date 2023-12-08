public class Lab05 {
    public static void main(String[] args) {
        // Create a Warrior character
        WarriorCharacter warrior = new WarriorCharacter("Ares", 10);

        // Create a Mage character
        MageCharacter mage = new MageCharacter("Merlin", 8);

        // Display information about the characters
        warrior.displayCharacterInfo();
        mage.displayCharacterInfo();

        // Perform actions specific to each character class
        warrior.useSlashAttack();
        mage.castSpell();

        // Level up the characters
        warrior.levelUp();
        mage.levelUp();

        // Display updated information after leveling up
        warrior.displayCharacterInfo();
        mage.displayCharacterInfo();

        // Create Gauntlet and Ring accessories
        Gauntlet ironGauntlet = new IronGauntlet("Steel");
        MagicRing magicRing = new MagicRing("Fire");

        // Display information about the accessories
        ironGauntlet.displayAccessoryInfo();
        magicRing.displayAccessoryInfo();

        // Perform actions specific to each accessory class
        ironGauntlet.enhanceAttack();
        ironGauntlet.provideDefense();
        magicRing.enhanceMagic();
        magicRing.increaseManaRegeneration();
    }
}
