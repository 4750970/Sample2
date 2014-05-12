package application.generator;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Component;

import application.util.ExperienceValueType;
import application.util.LevelCalculator;
import application.util.NatureGenerator;

import model.monster.Base;
import model.monster.Effort;
import model.monster.GrownRates;
import model.monster.Individual;
import model.monster.PersonalitySetter;
import model.monster.Pokemon;
import model.monster.move.Category;
import model.monster.move.Move;
import model.monster.type.Type;
import model.place.Place;

@Component
public class MockGenerator implements IPokemonGenerator {

	@Override
	public Pokemon generate() {

		Pokemon pokemon = new Pokemon();
		
		//種族情報を決定
		pokemon.setBase(createBase());
		
		//性格などを含む個体情報を決定
		pokemon.setIndividual(createIndividual());
		
		//育成によって変わる情報（努力値、ニックネーム）を初期化
		pokemon.setEffort(createEffort());
		
		//技のセット
		pokemon.setMoves(createMoves());
		
		//以下、「Pokemon」型として「持つ情報を設定（メソッドに切り出すべき？）
		
		pokemon.setCurrentExp(1059860);
		//pokemon.setTrainer(generator.generate());
		pokemon.setBirthDate(new Date());
		pokemon.setBirthPlace(Place.なぞの場所);
		//pokemon.setNickName("けつばん");
		
		//設定した経験値に基づいて現在のレベルを計算
		LevelCalculator calculator = new LevelCalculator();
		int level = calculator.execute(pokemon);
		pokemon.setLevel(level);
		pokemon.setBirthLevel(level);
		
		CalculateStatus(pokemon);
		
		return pokemon;
	}
	
	private Base createBase(){
		Base base = new Base();
		base.setName("ミュウ");
		base.setIndexNumber(151);
		base.setType1(Type.エスパー);
		base.setType2(Type.なし);
		base.setMaxExp(ExperienceValueType.ONE_HUNDRED_FIVE);
		
		base.setHp(100);
		base.setAttack(100);
		base.setDiffence(100);
		base.setSpAttack(100);
		base.setSpDiffence(100);
		base.setSpeed(100);
		return base;	
	}
	
	private Individual createIndividual(){
		Random random = new Random();		
		Individual individual = new Individual();
		individual.setNature(NatureGenerator.execute());
		//individual.setSex(null);
		individual.setHp(random.nextInt(32));
		individual.setAttack(random.nextInt(32));
		individual.setDiffence(random.nextInt(32));
		individual.setSpAttack(random.nextInt(32));
		individual.setSpDiffence(random.nextInt(32));
		individual.setSpeed(random.nextInt(32));
		individual.setPersonality(PersonalitySetter.execute(individual));
		return individual;
	}
	
	private Effort createEffort(){
		//TODO ステータス毎に252、合計510までしか努力値を振れないようにする
		Effort effort = new Effort();
		effort.setHp(252);
		effort.setAttack(0);
		effort.setDiffence(0);
		effort.setSpAttack(0);
		effort.setSpDiffence(6);
		effort.setSpeed(252);
		return effort;
	}
	
	private Move[] createMoves(){
		//TODO 実装版ではデータベースから読み込み
		Move[] moves = new Move[3];
		
		Move move1 = new Move();
		move1.setName("サイコキネシス");
		move1.setType(Type.エスパー);
		move1.setCategory(Category.特殊);
		move1.setPower(90);
		move1.setAccuracy(100);
		move1.setPowerPoint(10);
		move1.setPriority(0);
		move1.setDirect(false);
		move1.setCanProtect(true);
		move1.setCanSnatch(false);
		
		Move move2 = new Move();
		move2.setName("シャドーボール");
		move2.setType(Type.ゴースト);
		move2.setCategory(Category.特殊);
		move2.setPower(80);
		move2.setAccuracy(100);
		move2.setPowerPoint(15);
		move2.setPriority(0);
		move2.setDirect(false);
		move2.setCanProtect(true);
		move2.setCanSnatch(false);
		
		moves[0] = move1;
		moves[1] = move2;
		return moves;
	}
	
	/**
	 * レベル・3値・性格補正を用いてステータスを計算
	 * @param pokemon
	 */
	private void CalculateStatus(Pokemon pokemon){
		//TODO クラスとして切り出す？
		
		//TODO DIするのが適切？
		GrownRates rates = new GrownRates();
		
		//HP
		pokemon.setHp(((pokemon.getBase().getHp() * 2 + pokemon.getIndividual().getHp() + pokemon.getEffort().getHp()/4) * pokemon.getLevel()/100) + 10 + pokemon.getLevel());		
		
		//攻撃
		double attack = Math.floor(((pokemon.getBase().getAttack() * 2 + pokemon.getIndividual().getAttack() + pokemon.getEffort().getAttack()/4) * pokemon.getLevel()/100) + 5) * rates.getGrownRates(pokemon.getIndividual().getNature().getNumber(), 0);
		pokemon.setAttack((int)attack);
		
		//防御
		double diffence = Math.floor(((pokemon.getBase().getDiffence() * 2 + pokemon.getIndividual().getDiffence() + pokemon.getEffort().getDiffence()/4) * pokemon.getLevel()/100) + 5) * rates.getGrownRates(pokemon.getIndividual().getNature().getNumber(), 1);
		pokemon.setDiffence((int)diffence);
		
		//特攻
		double spAttack = Math.floor(((pokemon.getBase().getSpAttack() * 2 + pokemon.getIndividual().getSpAttack() + pokemon.getEffort().getSpAttack()/4) * pokemon.getLevel()/100) + 5) * rates.getGrownRates(pokemon.getIndividual().getNature().getNumber(), 2);
		pokemon.setSpAttack((int)spAttack);
		
		//特防
		double spDiffence = Math.floor(((pokemon.getBase().getSpDiffence() * 2 + pokemon.getIndividual().getSpDiffence() + pokemon.getEffort().getSpDiffence()/4) * pokemon.getLevel()/100) + 5) * rates.getGrownRates(pokemon.getIndividual().getNature().getNumber(), 3);
		pokemon.setSpDiffence((int)spDiffence);
		
		//素早さ
		double speed = Math.floor(((pokemon.getBase().getSpeed() * 2 + pokemon.getIndividual().getSpeed() + pokemon.getEffort().getSpeed()/4) * pokemon.getLevel()/100) + 5) * rates.getGrownRates(pokemon.getIndividual().getNature().getNumber(), 4);
		pokemon.setSpeed((int)speed);
	}


}
