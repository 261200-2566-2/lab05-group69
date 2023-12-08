// RPGCharacter interface represents the common features of all RPG characters
interface RPGCharacter {
    void displayCharacterInfo();
    void levelUp();
    void gainExperience(int experiencePoints);
    void takeDamage(int damage);
    boolean isAlive();
}

// Warrior interface represents characters with a warrior job
interface Warrior extends RPGCharacter {
    void useSlashAttack();
    void useWarriorAbility();
}

// Mage interface represents characters with a mage job
interface Mage extends RPGCharacter {
    void castSpell();
    void useMageAbility();
}

// RPGAccessory interface represents the common features of all accessories
interface RPGAccessory {
    void displayAccessoryInfo();
    void applyEffect(RPGCharacter character);
}

// Gauntlet interface represents gauntlet-type accessories
interface Gauntlet extends RPGAccessory {
    void enhanceAttack();
    void provideDefense();
}

// Ring interface represents ring-type accessories
interface Ring extends RPGAccessory {
    void enhanceMagic();
    void increaseManaRegeneration();
}//