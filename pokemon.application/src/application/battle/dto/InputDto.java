package application.battle.dto;

import model.monster.Pokemon;

/**
 * 技選択画面への入力情報
 * @author 1
 *
 */
public class InputDto {

	//手持ちポケモン
	private Pokemon pokemon;

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	//
}
