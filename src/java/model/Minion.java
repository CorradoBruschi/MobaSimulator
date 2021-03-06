package model;

public class Minion{

	private int attackDamage, minionId;

	private Attack currentAttack,attackFromChampion,attackFromTurret;
	
	private Role role;

	
	
	public Minion(int attackDamage, int minionId, Role role) {
		this.attackDamage = attackDamage;
		this.minionId = minionId;
		this.role = role;
	}



	public Attack getAttackFromChampion() {
		return attackFromChampion;
	}



	public void setAttackFromChampion(Attack attackFromChampion) {
		this.attackFromChampion = attackFromChampion;
	}



	public Attack getAttackFromTurret() {
		return attackFromTurret;
	}



	public void setAttackFromTurret(Attack attackFromTurret) {
		this.attackFromTurret = attackFromTurret;
	}



	public int getAttackDamage() {
		return attackDamage;
	}




	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}




	public int getMinionId() {
		return minionId;
	}




	public void setMinionId(int minionId) {
		this.minionId = minionId;
	}




	public Attack getCurrentAttack() {
		return currentAttack;
	}




	public void setCurrentAttack(Attack currentAttack) {
		this.currentAttack = currentAttack;
	}




	public Role getRole() {
		return role;
	}




	public void setRole(Role role) {
		this.role = role;
	}




	@Override
	public String toString() {
		return "Minion"+this.minionId;
	}
	
		
	

	
	

}
