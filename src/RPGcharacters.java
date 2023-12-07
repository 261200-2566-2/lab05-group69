interface RPGCharacter {
    void displayCharacterInfo();
}

interface Warrior extends RPGCharacter {
    void useSlashAttack();
}

interface Mage extends RPGCharacter {
    void castFireball();
}

interface RPGAccessory {
    void displayAccessoryInfo();
}

interface Gauntlet extends RPGAccessory {
    void provideStrengthBuff();
}

interface Ring extends RPGAccessory {
    void provideMagicBuff();
}