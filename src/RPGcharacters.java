interface RPGCharacter {
    void displayCharacterInfo();
}

// Warrior interface represents characters with a warrior job
interface Warrior extends RPGCharacter {
    void useSlashAttack();
}

// Mage interface represents characters with a mage job
interface Mage extends RPGCharacter {
    void castSpell();
}

// RPGAccessory interface represents the common features of all accessories
interface RPGAccessory {
    void displayAccessoryInfo();
}

// Gauntlet interface represents gauntlet-type accessories
interface Gauntlet extends RPGAccessory {
    void enhanceAttack();
}

// Ring interface represents ring-type accessories
interface Ring extends RPGAccessory {
    void enhanceMagic();
}