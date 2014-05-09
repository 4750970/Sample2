package model.monster.type;

/**
 * ポケモンのタイプ
 * TODO nameは不要？
 * @author 1
 *
 */
public enum Type {
	なし(0, "なし"),
	ノーマル(1, "ノーマル"),
	ほのお(2, "ほのお"),
	みず(3, "みず"),
	でんき(4, "でんき"),
	くさ(5, "くさ"),
	こおり(6, "こおり"),
	かくとう(7, "かくとう"),
	どく(8, "どく"),
	じめん(9, "じめん"),
	ひこう(10, "ひこう"),
	エスパー(11, "エスパー"),
	むし(12, "むし"),
	いわ(13, "いわ"),
	ゴースト(14, "ゴースト"),
	ドラゴン(15, "ドラゴン"),
	あく(16, "あく"),
	はがね(17, "はがね"),
	フェアリー(18, "フェアリー");
	
	//TODO finalにしないとダメ？
	//タイプ名
	private String name;
	
	//タイプ番号
	private int number;
	
	Type(int number, String name){
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
