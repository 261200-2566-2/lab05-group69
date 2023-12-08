class IronGauntlet implements Gauntlet {
    private String type;

    public IronGauntlet(String type) {
        this.type = type;
    }

    public void displayAccessoryInfo() {
        System.out.println("Gauntlet Type: " + type);
    }

    public void enhanceAttack() {
        System.out.println("The gauntlet enhances the wearer's attack power!");
    }

    public void provideDefense() {
        System.out.println("The gauntlet provides additional defense!");
    }

    public void applyEffect(RPGCharacter character) {
        System.out.println("Iron gauntlet's special effect applied: Defensive Stance!");
        // For example, increase the character's defense for a few turns
    }
}