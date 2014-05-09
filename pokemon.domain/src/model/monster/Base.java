package model.monster;

import model.monster.type.Type;

public class Base {
	
	//TODO 覚える技のリスト（レベル別、技マシンetc.）
	
	//TODO 特性1・2（リストで持つ？分けて持つ？）
	private Nature nature;
	
	//進化先の図鑑No.
	//private int evolvesInto;
	
	//TODO 進化前も設定？（ヒトカゲからカメックスに進化できないように）
	//private int evolutionFrom;
	
	//TODO 夢特性
	
	//TODO 分類
	private String species;
	
	//TODO たかさ
	private double height;
	
	//TODO おもさ
	private double weight;
	
	//TODO タマゴグループ
	
	//TODO タマゴの歩数
	
	//TODO 基礎経験値
	
	//TODO 獲得努力値
	
	//TODO 捕捉率
	
	//TODO 初期なつき度
	
	//TODO 英語名
	private String englishName;
	
	//TODO 図鑑説明文（複数バージョンの説明文をコレクションで保持？）
	private String entry;

	//図鑑No.
	private int indexNumber;
	
	//種族名
	private String name;
	
	//最大経験値（経験値タイプ（）
	private int maxExp;
	
	//タイプ1　TODO 配列にすべき？
	private Type type1;
	
	//タイプ2
	private Type type2;

	//覚える技
	//private Move<> moves;
	
	//HP種族値
	private int hp;
	
	//こうげき種族値
	private int attack;
	
	//ぼうぎょ種族値
	private int diffence;
	
	//とくこう種族値
	private int spAttack;
	
	//とくぼう種族値
	private int spDiffence;
	
	//すばやさ種族値
	private int speed;

	public int getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDiffence() {
		return diffence;
	}

	public void setDiffence(int diffence) {
		this.diffence = diffence;
	}

	public int getSpAttack() {
		return spAttack;
	}

	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}

	public int getSpDiffence() {
		return spDiffence;
	}

	public void setSpDiffence(int spDiffence) {
		this.spDiffence = spDiffence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Type getType1() {
		return type1;
	}

	public void setType1(Type type1) {
		this.type1 = type1;
	}

	public Type getType2() {
		return type2;
	}

	public void setType2(Type type2) {
		this.type2 = type2;
	}

	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public Nature getNature() {
		return nature;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}
}
