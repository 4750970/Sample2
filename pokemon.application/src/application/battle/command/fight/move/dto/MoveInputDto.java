package application.battle.command.fight.move.dto;

import java.util.ArrayList;
import java.util.List;

import model.monster.Pokemon;
import model.trainer.Trainer;

/**
 * 
 * @author 1
 *
 */
public class MoveInputDto {

	//主人公
	private Trainer hero;
	
	//手持ち（TODO 最大6体までになるように制限かける）
	private List<Pokemon> party;
	
	//対戦相手
	private Trainer rival;
	
	//相手の手持ち
	private List<Pokemon> enemies;
	
	//コンストラクタ
	MoveInputDto(){
		party = new ArrayList<Pokemon>();
		enemies = new ArrayList<Pokemon>();
	}

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
