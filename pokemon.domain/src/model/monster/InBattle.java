package model.monster;

/**
 * 戦闘中のポケモンを表すクラス
 * @author 1
 *
 */
public class InBattle {
	
	private Pokemon pokemon;

	//状態異常（どく（もうどく）、やけど、ねむり、マヒ、ひんし） 重複しない
	//private volatileStatus;
	
	//状態変化（こんらん、メロメロなど）
	//バトル中限定かつ入れ替えで効果が消える
	//private nonVolatileStatus;
	
	//こうげきランク（-6から+6まで13段階）
	private int attack;
	
	//ぼうぎょランク
	private int diffence;
	
	//とくこうランク
	private int spAttack;
	
	//とくぼうランク
	private int spDiffence;
	
	//すばやさランク
	private int speed;
	
	//命中ランク
	private int accuracy;
	
	//回避ランク
	private int evasion;
	
	//急所率ランク
	//（技「アシストパワー」や特性「ムラっけ」の対象にならないなど、別枠扱い）
	private int criticalHitRatio;

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
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

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getEvasion() {
		return evasion;
	}

	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public int getCriticalHitRatio() {
		return criticalHitRatio;
	}

	public void setCriticalHitRatio(int criticalHitRatio) {
		this.criticalHitRatio = criticalHitRatio;
	}
	
	
}
