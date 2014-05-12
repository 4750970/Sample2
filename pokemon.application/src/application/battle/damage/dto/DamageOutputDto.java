package application.battle.damage.dto;

import model.monster.InBattle;

public class DamageOutputDto {
	
	//味方のポケモン
	private InBattle friend;
	
	//相手のポケモン
	private InBattle opponent;
	

	public InBattle getFriend() {
		return friend;
	}

	public void setFriend(InBattle friend) {
		this.friend = friend;
	}

	public InBattle getOpponent() {
		return opponent;
	}

	public void setOpponent(InBattle opponent) {
		this.opponent = opponent;
	}
	
}
