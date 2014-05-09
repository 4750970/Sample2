package model.monster;

/**
 * ポケモンの「個性」(※)をセットするクラス
 * （※ポケモンの一番高い個体値を示すもの）
 * @author 1
 *
 */
public class PersonalitySetter {
	
	/**
	 * 各ステータスの個体値のうち、最も高いステータスの種類と、それを5で割った余りの値で個性が決定される
	 * @param pokemon　個性を決定するポケモン
	 * @return 個性を示す文字列
	 */
	public static String execute(Individual individual){		
		//各ステータスを配列に格納
		int[] statusValues = {individual.getHp(), individual.getAttack(), individual.getDiffence(), individual.getSpAttack(), individual.getSpDiffence(), individual.getSpeed()};

		//TODO デバッグ用
//		for(int i = 0; i < statusValues.length; i++){
//			System.out.print(statusValues[i] + ",");
//		}
//		System.out.print("\n");
		
		//最も高いステータスの番号
		int bestStatusNumber = 0;
		
		//最も高いステータスの個体値
		int bestStatusValue = 0;
		
		//ステータスを1つずつ取得し、最大値を記録
		for(int i = 0; i < statusValues.length; i++){
			//TODO デバッグ用
//			System.out.println("現在の最高ステータスの番号" + bestStatusNumber);
//			System.out.println("現在の最高ステータスの個体値" + bestStatusValue);
			
			//配列から順にステータスを取得し、最大値を更新
			if(statusValues[i] == bestStatusValue){
				//TODO 最大値が複数ある場合（性格値を6で割った余りに対応するステータスの個性に決定）
			}else if(statusValues[i] > bestStatusValue){
				bestStatusNumber = i;
				bestStatusValue = statusValues[i];
			}
		}
		
		String[][] personality = {
			{"たべるのがだいすき", "ちからがじまん", "からだがじょうぶ", "こうきしんがつよい", "きがつよい", "かけっこがすき"},//余り0
			{"ひるねをよくする", "あばれることがすき", "うたれづよい", " イタズラがすき ", "ちょっぴりみえっぱり", "ものおとにびんかん"},//余り1
			{"いねむりがおおい", "ちょっとおこりっぽい", "ねばりづよい", "ぬけめがない", "まけんきがつよい", "おっちょこちょい"},//余り2
			{"ものをよくちらかす", "ケンカをするのがすき", "しんぼうづよい", "かんがえごとがおおい", " まけずぎらい ", "すこしおちょうしもの"},//余り3
			{"のんびりするのがすき", "ちのけがおおい", "がまんづよい", "とてもきちょうめん", "ちょっぴりごうじょう", "にげるのがはやい"},//余り4
		};
		
		return personality[bestStatusNumber/5][bestStatusNumber];
	};
}
