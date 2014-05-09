package application.sample.dto;

import model.monster.Pokemon;

/**
 * コマンド選択画面からの出力情報
 * @author 1
 *
 */
public class SampleOutputDto {

	private Pokemon pokemon;

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}
