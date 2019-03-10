class Item {

    private int bonusHP;
    private int bonusAdForce;
    private double bonusAtSpd;
    private double bonusEvade;
    private int cost;


    public Item(int bonusHP, int bonusAdForce, double bonusAtSpd, double bonusEvade, int cost) {
        this.bonusHP = bonusHP;
        this.bonusAdForce = bonusAdForce;
        this.bonusAtSpd = bonusAtSpd;
        this.bonusEvade = bonusEvade;
        this.cost = cost;
    }

    public Item() {
        this.bonusEvade = 0;
        this.bonusAdForce = 0;
        this.bonusAtSpd = 0.0;
        this.bonusEvade = 0.0;
        this.cost = 0;
    }

    public int getBonusHP() {
        return bonusHP;
    }

    public void setBonusHP(int bonusHP) {
        this.bonusHP = bonusHP;
    }

    public int getBonusAdForce() {
        return bonusAdForce;
    }

    public void setBonusAdForce(int bonusAdForce) {
        this.bonusAdForce = bonusAdForce;
    }

    public double getBonusAtSpd() {
        return bonusAtSpd;
    }

    public void setBonusAtSpd(double bonusAtSpd) {
        this.bonusAtSpd = bonusAtSpd;
    }

    public double getBonusEvade() {
        return bonusEvade;
    }

    public void setBonusEvade(double bonusEvade) {
        this.bonusEvade = bonusEvade;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}