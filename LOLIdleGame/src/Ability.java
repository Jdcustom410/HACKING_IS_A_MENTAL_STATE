
public class Ability {
	public int cd;
	public int adaptiveForceDealt;
	public int bonusHealth;
	public int bonusAdaptiveForce;
	public double bonusAttackSpeed;
	public double bonusEvasion;
	
	public Ability(int cd, int adaptiveForceDealt, int bonusHealth, int bonusAdaptiveForce, double bonusAttackSpeed, double bonusEvasion){
		this.cd = cd;
		this.adaptiveForceDealt = adaptiveForceDealt;
		this.bonusHealth = adaptiveForceDealt;
		this.bonusAttackSpeed = bonusAttackSpeed;
		this.bonusEvasion = bonusEvasion;
	}
	
	public Ability(){
		this.cd = 0;
		this.adaptiveForceDealt = 0;
		this.bonusHealth = 0;
		this.bonusAttackSpeed = 0;
		this.bonusEvasion = 0;
	}

	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
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
