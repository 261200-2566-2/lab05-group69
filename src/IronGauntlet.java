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
}
