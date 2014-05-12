package application.sample.dto;

import java.util.ArrayList;
import java.util.List;

import model.monster.Pokemon;
import model.trainer.Trainer;

/**
 * コマンド選択画面への入力情報
 * @author 1
 *
 */
public class CommandInputDto {
	
	//主人公
	private Trainer hero;
	
	//手持ち（TODO 最大6体までになるように制限かける）
	private List<Pokemon> party;
	
	//対戦相手
	private Trainer rival;
	
	//相手の手持ち
	private List<Pokemon> enemies;
	
	//コンストラクタ
	CommandInputDto(){
		party = new ArrayList<Pokemon>();
		enemies = new ArrayList<Pokemon>();
	}

	/*
	 * 以下、getter、setter
	 */
	
	public Trainer getHero() {
		return hero;
	}

	public void setHero(Trainer hero) {
		this.hero = hero;
	}

	public List<Pokemon> getParty() {
		return party;
	}

	public void setParty(List<Pokemon> party) {
		this.party = party;
	}

	public Trainer getRival() {
		return rival;
	}

	public void setRival(Trainer rival) {
		this.rival = rival;
	}

	public List<Pokemon> getEnemies() {
		return enemies;
	}

	public void setEnemies(List<Pokemon> enemies) {
		this.enemies = enemies;
	}
}
