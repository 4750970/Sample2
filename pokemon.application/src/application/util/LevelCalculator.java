package application.util;

import model.monster.Pokemon;

/**
 * 経験値からレベルを計算するクラス
 * @author 1
 *
 */
public class LevelCalculator {

	/**
	 * 経験値からポケモンのレベルを計算
	 * @param pokemon
	 * @param exp
	 * @return
	 */
	public int execute(Pokemon pokemon){
		RequiredExpCalculator requiredExpCalculator = new RequiredExpCalculator();
		
		//現在のレベル
		int level = pokemon.getLevel();
		
		//現在の経験値
		int currentExp = pokemon.getCurrentExp();
		
		//最大経験値（経験値タイプ）
		int maxExp = pokemon.getBase().getMaxExp();
		
		//～まで処理を繰り返し
		while(level < 100){
			//次のレベルに必要な経験値を取得
			int requiredExp = requiredExpCalculator.execute(level + 1, maxExp);
			
			//現在の経験値が次のレベルに必要な経験値を超えていれば
			if(requiredExp <= currentExp){
				//pokemon.setLevel(pokemon.getLevel() + 1);
				level++;
				//TODO 1レベル毎にViewに通知する仕組みが必要？
				//System.out.println(pokemon.getBase().getName() + "はレベル" + level + "になった！");
			} else {
				//処理を終了
				break;
			}
		}
		return level;
	}
}
