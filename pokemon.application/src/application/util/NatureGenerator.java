package application.util;

import java.util.Random;

import model.monster.Nature;

/**
 * ランダムに性格を生成するクラス
 * TODO 「特性」実装後はここの方式に変える？（http://wiki.ポケモン.com/wiki/%E6%80%A7%E6%A0%BC%E5%80%A4）
 * @author 1
 *
 */
public class NatureGenerator {
	
	private NatureGenerator(){}

	public static Nature execute(){
		Random random = new Random();
		
		switch(random.nextInt(25)){
		case 0:
			return Nature.がんばりや;
		case 1:
			return Nature.さみしがり;
		case 2:
			return Nature.ゆうかん;
		case 3:
			return Nature.いじっぱり;
		case 4:
			return Nature.やんちゃ;
		case 5:
			return Nature.ずぶとい;
		case 6:
			return Nature.すなお;
		case 7:
			return Nature.のんき;
		case 8:
			return Nature.わんぱく;
		case 9:
			return Nature.のうてんき;
		case 10:
			return Nature.おくびょう;
		case 11:
			return Nature.せっかち;
		case 12:
			return Nature.まじめ;
		case 13:
			return Nature.ようき;
		case 14:
			return Nature.むじゃき;
		case 15:
			return Nature.ひかえめ;
		case 16:
			return Nature.おっとり;
		case 17:
			return Nature.れいせい;
		case 18:
			return Nature.てれや;
		case 19:
			return Nature.うっかりや;
		case 20:
			return Nature.おだやか;
		case 21:
			return Nature.おとなしい;
		case 22:
			return Nature.なまいき;
		case 23:
			return Nature.しんちょう;
		case 24:
			return Nature.きまぐれ;
		default:
			//TODO 文法上必要でも、実質ありえないケースでは？別の書き方はない？
			return null;
		}
	}
}
