package application.sample.dto;

import java.util.List;

import model.monster.Pokemon;

/**
 * コマンド選択画面からの出力情報
 * @author 1
 *
 */
public class CommandOutputDto {

	//手持ちのポケモン（最大6体）
	private List<Pokemon> party;
	
	/**
	 * 以下、getter、setter
	 */
	
	public List<Pokemon> getParty() {
		return party;
	}

	public void setParty(List<Pokemon> party) {
		this.party = party;
	}
}
