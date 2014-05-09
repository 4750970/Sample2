package model.trainer;

import model.monster.Pokemon;

public class Trainer {

	//トレーナーの名前
	private String name;
	
	//トレーナーID
	private int id;
	
	//トレーナーの肩書き
	private String type;
	
	//手持ちポケモン（最大6体）
	private Pokemon[] party;
	
	//TODO 過去の対戦成績（win,lose）
	
	//TODO 賞金
	
	public Trainer(String name, int id){
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pokemon[] getParty() {
		return party;
	}

	public void setParty(Pokemon[] party) {
		this.party = party;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
