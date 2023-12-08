public class Lab05 {
    public static void main(String[] args) {
        // Create a Warrior character
        WarriorCharacter warrior = new WarriorCharacter("Ares", 10);

        // Create a Mage character
        MageCharacter mage = new MageCharacter("Merlin", 8);

        // Create Gauntlet and Ring accessories
        Gauntlet ironGauntlet = new IronGauntlet("Steel");
        MagicRing magicRing = new MagicRing("Fire");

        // Display information about the characters and accessories
        warrior.displayCharacterInfo();
        mage.displayCharacterInfo();
        ironGauntlet.displayAccessoryInfo();
        magicRing.displayAccessoryInfo();

        // Simulate a battle scenario
        simulateBattle(warrior, mage, ironGauntlet, magicRing);

        // Display final information after the battle
        warrior.displayCharacterInfo();
        mage.displayCharacterInfo();
        ironGauntlet.displayAccessoryInfo();
        magicRing.displayAccessoryInfo();
    }

    private static void simulateBattle(Warrior warrior, Mage mage, Gauntlet gauntlet, Ring ring) {
        // Warrior attacks Mage
        warrior.useSlashAttack();
        mage.takeDamage(20);

        // Mage counterattacks
        mage.castSpell();
        warrior.takeDamage(15);

        // Warrior uses a special ability
        warrior.useWarriorAbility();

        // Mage uses a special ability
        mage.useMageAbility();

        // Accessories apply their effects
        gauntlet.applyEffect(warrior);
        ring.applyEffect(mage);
    }
}//
