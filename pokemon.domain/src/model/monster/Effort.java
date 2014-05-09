package model.monster;

public class Effort {
	
	//HP努力値
	private int hp;
	
	//こうげき努力値
	private int attack;
	
	//ぼうぎょ努力値
	private int diffence;
	
	//とくこう努力値
	private int spAttack;
	
	//とくぼう努力値
	private int spDiffence;
	
	//すばやさ努力値
	private int speed;

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
	
	//覚えている技 TODO（1～4まで変数を作成する？）「Pokemon」と「Effort」どちらで持つべき？
	//private Move[] moves;
	
	//もちもの
	//private Item item;

}
