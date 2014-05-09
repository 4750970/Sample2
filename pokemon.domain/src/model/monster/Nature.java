package model.monster;

/**
 * ポケモンの性格
 * TODO nameは不要？
 * @author 1
 *
 */
public enum Nature {
	がんばりや(0, "がんばりや"),
	さみしがり(1, "さみしがり"),
	ゆうかん(2, "ゆうかん"),
	いじっぱり(3, "いじっぱり"),
	やんちゃ(4, "やんちゃ"),
	ずぶとい(5, "ずぶとい"),
	すなお(6, "すなお"),
	のんき(7, "のんき"),
	わんぱく(8, "わんぱく"),
	のうてんき(9, "のうてんき"),
	おくびょう(10, "おくびょう"),
	せっかち(11, "せっかち"),
	まじめ(12, "まじめ"),
	ようき(13, "ようき"),
	むじゃき(14, "むじゃき"),
	ひかえめ(15, "ひかえめ"),
	おっとり(16, "おっとり"),
	れいせい(17, "れいせい"),
	てれや(18, "てれや"),
	うっかりや(19, "うっかりや"),
	おだやか(20, "おだやか"),
	おとなしい(21, "おとなしい"),
	なまいき(22, "なまいき"),
	しんちょう(23, "しんちょう"),
	きまぐれ(24, "きまぐれ");	
	
	//タイプ名
	private String name;
	
	private int number;
	
	Nature(int number, String name){
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
