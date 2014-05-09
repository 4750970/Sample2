package application.util;

/**
 * 種族毎の経験値タイプに応じて、「次のレベルに必要な経験値」を計算するクラス
 * @author 1
 *
 */
public class RequiredExpCalculator {

	public int execute(int nextLevel, int maxExp){
		int requiredExp = 0;
		
		//既にレベルが100だった場合
		if(101 <= nextLevel){
			return 0;
		}
		
		//経験値タイプに応じて処理を分岐
		switch(maxExp){
		
		//経験値タイプが「60万タイプ」の場合 
		case ExperienceValueType.SIXTY:
			if(2 <= nextLevel && nextLevel <= 50){
				requiredExp = (int)Math.floor(Math.pow(nextLevel, 3) * (100 - nextLevel) / 50);
			} else if(50 <= nextLevel && nextLevel <= 68){
				requiredExp = (int)Math.floor(Math.pow(nextLevel, 3) * (150 - nextLevel) / 100);	
			} else if(68 <= nextLevel && nextLevel <= 98){
				requiredExp = (int)Math.floor(Math.pow(nextLevel, 3) * Math.floor((637 - 10 * nextLevel / 3)) / 500);
			} else if(98 <= nextLevel && nextLevel <= 100){
				requiredExp = (int)Math.floor(Math.pow(nextLevel, 3) * (160 - nextLevel) / 100);
			}
			break;
		
		//経験値タイプが「80万タイプ」の場合 
		case ExperienceValueType.EIGHTY:
			requiredExp = (int)Math.floor(0.8 * Math.pow(nextLevel, 3));
			break;
			
		//経験値タイプが「100万タイプ」の場合
		case ExperienceValueType.ONE_HUNDRED:
			requiredExp = (int)Math.pow(nextLevel, 3);
			break;
		
		//経験値タイプが「105万タイプ」の場合
		case ExperienceValueType.ONE_HUNDRED_FIVE:
			requiredExp = (int)Math.floor(1.2 * Math.pow(nextLevel, 3) -15 * Math.pow(nextLevel, 2) + 100 * nextLevel - 140);
			break;
		
		//経験値タイプが「125万タイプ」の場合
		case ExperienceValueType.ONE_HUNDRED_TWENTY_FIVE:
			requiredExp = (int)Math.floor(1.25 * Math.pow(nextLevel, 3));
			break;
		
		//経験値タイプが「164万タイプ」の場合、
		case ExperienceValueType.ONE_HUNDRED_SIXTY_FOUR:
			if(2 <= nextLevel && nextLevel <= 15){
				requiredExp = (int)Math.floor(Math.pow(nextLevel, 3) * (24 + Math.floor((nextLevel + 1) / 3)) / 50);		
			} else if(15 <= nextLevel && nextLevel <= 36){
				requiredExp = (int)Math.floor(Math.pow(nextLevel, 3) * (14 + nextLevel) / 50);		
			} else if(36 <= nextLevel && nextLevel <= 100){
				requiredExp = (int)Math.floor(Math.pow(nextLevel, 3) * (32 + Math.floor(nextLevel / 2))/50)  ;
			}
			break;
		}
		return requiredExp;
	}
}
