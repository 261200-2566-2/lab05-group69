class IronGauntlet implements Gauntlet {
    private String type;
    private int durability;

    public IronGauntlet(String type) {
        this.type = type;
        this.durability = 100; // Starting durability
    }

    public void displayAccessoryInfo() {
        System.out.println("Gauntlet Type: " + type + ", Durability: " + durability);
    }

    public void enhanceAttack() {
        System.out.println("The gauntlet enhances the wearer's attack power!");
    }

    public void provideDefense() {
        System.out.println("The gauntlet provides additional defense!");
    }
}