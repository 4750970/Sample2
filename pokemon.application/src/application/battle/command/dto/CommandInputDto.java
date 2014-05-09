package application.battle.command.dto;

import model.monster.InBattle;
import model.monster.move.Move;

public class CommandInputDto {
	
	//味方のポケモン
	private InBattle friend;
	
	//画面から入力された技
	private Move selectedMove;
	
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

	public Move getSelectedMove() {
		return selectedMove;
	}

	public void setSelectedMove(Move selectedMove) {
		this.selectedMove = selectedMove;
	}
	
}
