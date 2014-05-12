package application.battle.damage.service;

import model.monster.InBattle;
import model.monster.move.Category;
import model.monster.move.Move;

import org.springframework.stereotype.Component;

import application.battle.damage.dto.DamageInputDto;
import application.battle.damage.dto.DamageOutputDto;
import application.framework.service.IApplicationService;
import application.util.RandomUtil;

/**
 * コマンド選択画面への遷移時に使用するサービス
 * @author 1
 *
 */
@Component("DamageService")
public class DamageService implements IApplicationService<DamageInputDto, DamageOutputDto> {

	public DamageOutputDto execute(DamageInputDto input){
		
		//TODO 
		System.out.println("DamageService execute");
		
		
		
		DamageOutputDto output = new DamageOutputDto();
		
		
		
		return output;
	}
	
	/**
	 * TODO
	 * 
	 * @param input
	 * @return
	 */
	private DamageOutputDto MockBattle(DamageInputDto input){
		
		DamageOutputDto output = new DamageOutputDto();
		
		//先攻・後攻の判定
		determineFirst(input);
		
		//ダメージ計算
		calculateDamage(input);
		
		//倒したかどうかの判定
		
		return output;
	}
	
	/**
	 * 先攻後攻の決定
	 */
	private void determineFirst(DamageInputDto input){
		
		//TODO　優先度に関する特性のチェック
		
		//画面から入力された技
		int friendPriority = input.getSelectedMove().getPriority();
		
		//相手のポケモンが選択した技（TODO 現時点ではランダムに決定）
		int opponentPriority = input.getOpponent().getPokemon().getMoves()[RandomUtil.randomInt(2)].getPriority();
		
		
		if(friendPriority == opponentPriority){
			//技の優先度が同じ場合、素早さによる判定を行う
			
		}
		
		//優先度が同じ場合、互いの素早さによる判定
		
		int friendSpeed = input.getFriend().getSpeed();
		
		int opponentSpeed = input.getOpponent().getSpeed();
	}
	
	/**
	 * 技のダメージ計算を行うメソッド(仮)
	 * @param input
	 * @return
	 */
	private int calculateDamage(DamageInputDto input){
		
		//TODO タイプ判定
		
		//TODO 攻撃側のポケモン
		InBattle attacker = input.getFriend();		
		
		//TODO 防御側のポケモン
		InBattle diffender = input.getOpponent();
		
		//選択された技の種類
		Category category = input.getSelectedMove().getCategory();
		
		//攻撃側のレベル
		int attackerLevel = attacker.getPokemon().getLevel();
		
		//技の威力
		int power = input.getSelectedMove().getPower();
		
		//攻撃側の能力値
		int attackerStatus = 0;
		
		//守備側の能力値
		int diffenderStatus = 0;
		
		
		switch (category){
		case 物理:
			attackerStatus = attacker.getAttack();
			diffenderStatus = diffender.getDiffence();
			break;
		case 特殊:
			attackerStatus = attacker.getSpAttack();
			diffenderStatus = diffender.getSpDiffence();
			break;
		case 変化:
			//TODO
			break;		
		}
		
		//((攻撃側のレベル　× 2 ÷ 5 +　2) ×　技の威力 ×　攻撃側の能力値　÷　防御側の能力値　÷　50 + 2) × (0.85～1.00の乱数)
		int damage = (int)Math.floor(((attackerLevel * 2 / 5 + 2) * power * attackerStatus / diffenderStatus / 50 + 2) * (1 - RandomUtil.randomInt(15)/100)); 
		
		return damage;
	}
}