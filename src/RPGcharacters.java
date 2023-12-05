// RPGCharacter interface represents the common features of all RPG characters
interface RPGCharacter {
    void displayCharacterInfo();
}

// Warrior interface represents characters with a warrior job
interface Warrior extends RPGCharacter {
    void useSlashAttack();
}

// Mage interface represents characters with a mage job
interface Mage extends RPGCharacter {
    void castFireball();
}

// RPGAccessory interface represents the common features of all accessories
interface RPGAccessory {
    void displayAccessoryInfo();
}

// Gauntlet interface represents gauntlet-type accessories
interface Gauntlet extends RPGAccessory {
    void provideStrengthBuff();
}

// Ring interface represents ring-type accessories
interface Ring extends RPGAccessory {
    void provideMagicBuff();
}

// Example implementation of a Warrior character
class WarriorCharacter implements Warrior {
    public void displayCharacterInfo() {
        System.out.println("Warrior Character - Strong and skilled in melee combat.");
    }

    public void useSlashAttack() {
        System.out.println("Used a powerful slash attack!");
    }
}

// Example implementation of a Mage character
class MageCharacter implements Mage {
    public void displayCharacterInfo() {
        System.out.println("Mage Character - Masters the arcane arts and wields powerful spells.");
    }

    public void castFireball() {
        System.out.println("Cast a blazing fireball!");
    }
}

// Example implementation of a Gauntlet accessory
class IronGauntlet implements Gauntlet {
    public void displayAccessoryInfo() {
        System.out.println("Iron Gauntlet - Increases strength and melee damage.");
    }

    public void provideStrengthBuff() {
        System.out.println("Strength buff applied!");
    }
}

// Example implementation of a Ring accessory
class MagicRing implements Ring {
    public void displayAccessoryInfo() {
        System.out.println("Magic Ring - Enhances magical abilities and spellcasting.");
    }

    public void provideMagicBuff() {
        System.out.println("Magic buff applied!");
    }
}
