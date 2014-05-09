package application.sample.dto;

import model.monster.Pokemon;
import model.trainer.Trainer;

/**
 * コマンド選択画面への入力情報
 * @author 1
 *
 */
public class SampleInputDto {
	
	//主人公
	private Trainer hero;

	//主人公のポケモン
	private Pokemon pokemon;

	public Trainer getHero() {
		return hero;
	}

	public void setHero(Trainer hero) {
		this.hero = hero;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}
