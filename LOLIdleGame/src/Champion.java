public class Champion {
	//Passive?
	private int health;
	private int adaptivateForce;
	private double attackSpeed;
	private double evasion;
	private int gold;
	private Item[] items = new Item[6];
	private Ability[] abilities = new Ability[2];
	
	public Champion(int health, int adaptiveForce, double attackSpeed, double evasion, int gold, Item[] items, Ability[] abilities){
		this.health = health;
		this.adaptivateForce = adaptiveForce;
		this.attackSpeed = attackSpeed;
		this.evasion = evasion;
		this.gold = gold;
		this.items = items;
		this.abilities = abilities;
	}
	
	public Champion(){
		this.health = 0;
		this.adaptivateForce = 0;
		this.attackSpeed = 0;
		this.evasion = 0;
		this.gold = 0;
		this.items = null;
		this.abilities = null;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAdaptivateForce() {
		return adaptivateForce;
	}

	public void setAdaptivateForce(int adaptivateForce) {
		this.adaptivateForce = adaptivateForce;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public double getEvasion() {
		return evasion;
	}

	public void setEvasion(double evasion) {
		this.evasion = evasion;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Ability[] getAbilities() {
		return abilities;
	}

	public void setAbilities(Ability[] abilities) {
		this.abilities = abilities;
	}
	
}
