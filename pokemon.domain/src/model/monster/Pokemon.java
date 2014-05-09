package model.monster;

import java.util.Date;

import model.monster.move.Move;
import model.place.Place;
import model.trainer.Trainer;

/**
 * 
 * @author 1
 *
 */
public class Pokemon {
	
	//ニックネーム（ここで持つべき情報？）
	private String nickName;
	
	//レベル
	private int level = 1;
	
	//種族値
	private Base base;
	
	//個体値
	private Individual individual;
	
	//努力値
	private Effort effort;
	
	//親（トレーナー）
	private Trainer trainer;
	
	//現在の獲得経験値
	private int currentExp;
	
	//次のレベルまでに必要な経験値
	private int requiredExp;

	//HP
	private int hp;
	
	//こうげき
	private int attack;
	
	//ぼうぎょ
	private int diffence;
	
	//とくこう
	private int spAttack;
	
	//とくぼう
	private int spDiffence;
	
	//すばやさ
	private int speed;
	
	//覚えている技（TODO 配列？1～4まで個別に設定？）
	private Move[] moves;
	
	//出会った日
	private Date birthDate;
	
	//TODO 出会った場所（定数クラスを定義？）
	private Place birthPlace;
	
	//TODO 出会ったレベル
	private int birthLevel;
	
	//TODO 所持しているリボン
	
	//TODO ボールの種類
	
	//TODO マーキング（●▲■など）	
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public Individual getIndividual() {
		return individual;
	}

	public void setIndividual(Individual individual) {
		this.individual = individual;
	}

	public Effort getEffort() {
		return effort;
	}

	public void setEffort(Effort effort) {
		this.effort = effort;
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


	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public int getCurrentExp() {
		return currentExp;
	}

	public void setCurrentExp(int currentExp) {
		this.currentExp = currentExp;
	}

	public int getRequiredExp() {
		return requiredExp;
	}

	public void setRequiredExp(int requiredExp) {
		this.requiredExp = requiredExp;
	}

	public String getNickName() {
		String nickName = this.nickName;
		if(nickName == null || nickName.equals("")){
			nickName = base.getName();
		}
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Place getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(Place birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getBirthLevel() {
		return birthLevel;
	}

	public void setBirthLevel(int birthLevel) {
		this.birthLevel = birthLevel;
	}

	public Move[] getMoves() {
		return moves;
	}

	public void setMoves(Move[] moves) {
		this.moves = moves;
	}

}
