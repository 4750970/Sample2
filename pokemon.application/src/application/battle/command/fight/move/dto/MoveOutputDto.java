package application.battle.command.fight.move.dto;

import java.util.List;

import model.monster.Pokemon;

/**
 * 
 * @author 1
 *
 */
public class MoveOutputDto {
	
	
	//手持ちのポケモン（最大6体）
	private List<Pokemon> party;
	
	//相手の手持ち
	private List<Pokemon> enemies;	

	private Pokemon pokemon;

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public List<Pokemon> getParty() {
		return party;
	}

	public void setParty(List<Pokemon> party) {
		this.party = party;
	}

	public List<Pokemon> getEnemies() {
		return enemies;
	}

	public void setEnemies(List<Pokemon> enemies) {
		this.enemies = enemies;
	}
	
	
}
