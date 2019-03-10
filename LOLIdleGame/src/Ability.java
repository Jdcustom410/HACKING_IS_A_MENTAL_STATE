
public class Ability {
	private int cooldown;
	private int adaptiveForceDealt;
	private int bonusHealth;
	private int bonusAdaptiveForce;
	private double bonusAttackSpeed;
	private double bonusEvasion;
	
	public Ability(int cd, int adaptiveForceDealt, int bonusHealth, int bonusAdaptiveForce, double bonusAttackSpeed, double bonusEvasion){
		this.cooldown = cd;
		this.adaptiveForceDealt = adaptiveForceDealt;
		this.bonusHealth = bonusHealth;
		this.bonusAdaptiveForce = bonusAdaptiveForce;
		this.bonusAttackSpeed = bonusAttackSpeed;
		this.bonusEvasion = bonusEvasion;
	}
	
	public Ability(){
		this.cooldown = 0;
		this.adaptiveForceDealt = 0;
		this.bonusHealth = 0;
		this.bonusAdaptiveForce = 0;
		this.bonusAttackSpeed = 0;
		this.bonusEvasion = 0;
	}

	public int getCd() {
		return cooldown;
	}

	public void setCd(int cd) {
		this.cooldown = cd;
	}

	public int getAdaptiveForceDealt() {
		return adaptiveForceDealt;
	}

	public void setAdaptiveForceDealt(int adaptiveForceDealt) {
		this.adaptiveForceDealt = adaptiveForceDealt;
	}

	public int getBonusHealth() {
		return bonusHealth;
	}

	public void setBonusHealth(int bonusHealth) {
		this.bonusHealth = bonusHealth;
	}

	public int getBonusAdaptiveForce() {
		return bonusAdaptiveForce;
	}

	public void setBonusAdaptiveForce(int bonusAdaptiveForce) {
		this.bonusAdaptiveForce = bonusAdaptiveForce;
	}

	public double getBonusAttackSpeed() {
		return bonusAttackSpeed;
	}

	public void setBonusAttackSpeed(double bonusAttackSpeed) {
		this.bonusAttackSpeed = bonusAttackSpeed;
	}

	public double getBonusEvasion() {
		return bonusEvasion;
	}

	public void setBonusEvasion(double bonusEvasion) {
		this.bonusEvasion = bonusEvasion;
	}
	
}
