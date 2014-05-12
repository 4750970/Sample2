package model.monster.move;

import model.monster.type.Type;

public class Move {
	
	private int number;
	
	private String name;
	
	//タイプ
	private Type type;
	
	//分類（物理・特殊・変化のいずれか）
	private Category category;
	
	//威力
	private int power;
	
	//命中率
	private int accuracy;
	
	//PP（使用可能な回数）
	private int powerPoint;
	
	//現在のPP（TODO ここで管理すべき情報？）
	private int currentPoint;
	
	//優先度（高ければ先制できる　最大6）
	private int priority;
	
	//TODO 急所率
	
	//TODO　ダブルバトル等で攻撃可能な範囲
	//private ～ target;
	
	//直接攻撃フラグ
	private boolean isDirect;
	
	//技「まもる」が有効か
	private boolean canProtect;
	
	//技「よこどり」が有効か
	private boolean canSnatch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getPowerPoint() {
		return powerPoint;
	}

	public void setPowerPoint(int powerPoint) {
		this.powerPoint = powerPoint;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isDirect() {
		return isDirect;
	}

	public void setDirect(boolean isDirect) {
		this.isDirect = isDirect;
	}

	public boolean isCanProtect() {
		return canProtect;
	}

	public void setCanProtect(boolean canProtect) {
		this.canProtect = canProtect;
	}

	public boolean isCanSnatch() {
		return canSnatch;
	}

	public void setCanSnatch(boolean canSnatch) {
		this.canSnatch = canSnatch;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCurrentPoint() {
		return currentPoint;
	}

	public void setCurrentPoint(int currentPoint) {
		this.currentPoint = currentPoint;
	}

	
	//TODO 持ち物「おうじゃのしるし」(King's Rock)が有効か
	//private boolean 
	
	//効果
	//private Effect effect;
}
