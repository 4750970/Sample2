package model.monster;

public class Individual {
	
	//せいかく
	private Nature nature;
	
	//性別
	private boolean sex;
	
	//特性
	//private Ability ability;
	
	//個性
	private String personality;
	
	//HP個体値
	private int hp;
	
	//こうげき個体値
	private int attack;
	
	//ぼうぎょ個体値
	private int diffence;
	
	//とくこう個体値
	private int spAttack;
	
	//とくぼう個体値
	private int spDiffence;
	
	//すばやさ個体値
	private int speed;

	public Nature getNature() {
		return nature;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDiffence() {
		return diffence;
	}

	public void setDiffence(int diffence) {
		this.diffence = diffence;
	}

	public int getSpAttack() {
		return spAttack;
	}

	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}

	public int getSpDiffence() {
		return spDiffence;
	}

	public void setSpDiffence(int spDiffence) {
		this.spDiffence = spDiffence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}
	
	//TODO 個性（個体値から算出？）

}
