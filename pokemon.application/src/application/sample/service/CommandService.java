package application.sample.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.monster.Pokemon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import application.framework.service.IApplicationService;
import application.generator.IPokemonGenerator;
import application.sample.dto.CommandInputDto;
import application.sample.dto.CommandOutputDto;

/**
 * コマンド選択画面への遷移で使用するサービス
 * @author 1
 *
 */
@Component("MockService")
public class CommandService implements IApplicationService<CommandInputDto, CommandOutputDto> {
	
	private static Log logger = LogFactory.getLog(CommandService.class);
	
	@Autowired
	private IPokemonGenerator generator;

	/**
	 * 
	 */
	public CommandOutputDto execute(CommandInputDto input){
		logger.info("SampleService.execute");
		CommandOutputDto output = new CommandOutputDto();
		
		try{
			List<Pokemon> party = new ArrayList<Pokemon>();
			
			party = input.getParty();

			party.add(generator.generate());
			System.out.println(party.get(0).getNickName());
			output.setParty(party);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return output;
	}
	
	//TODO デバッグ用。動作確認後、削除
	private void showStatus(Pokemon pokemon){
		System.out.println("図鑑No.：　" + pokemon.getBase().getIndexNumber());
		System.out.println("種族名：　" + pokemon.getBase().getName());
		System.out.println("タイプ1：　" + pokemon.getBase().getType1());
		System.out.println("タイプ2：　" + pokemon.getBase().getType2());
		
		System.out.println("親：　" + pokemon.getTrainer().getName());
		System.out.println("ID：　" + pokemon.getTrainer().getId());
		System.out.println("経験値：　" + pokemon.getCurrentExp());
		//System.out.println("つぎのレベルまで：　" + requiredExpCalculator.execute(pokemon.getLevel() + 1, pokemon.getBase().getMaxExp()) +"\n");
		
		System.out.println("HP：　" + pokemon.getHp());
		System.out.println("こうげき：　" + pokemon.getAttack());
		System.out.println("ぼうぎょ：　" + pokemon.getDiffence());
		System.out.println("とくこう：　" + pokemon.getSpAttack());
		System.out.println("とくぼう：　" + pokemon.getSpDiffence());
		System.out.println("すばやさ：　" + pokemon.getSpeed());
		System.out.println("とくせい：　" + "【TODO】"+"\n");

		System.out.println("なまえ：　" + pokemon.getNickName());
		System.out.println("レベル：　" + pokemon.getLevel());
		
		//TODO 技は名前の他、タイプとPPも合わせて表示する
		System.out.println("わざ１：　" + pokemon.getMoves()[0].getName());	
		System.out.println("わざ２：　" + pokemon.getMoves()[1].getName());
		System.out.println("わざ３：　" + "【TODO】");
		System.out.println("わざ４：　" + "【TODO】"+"\n");
		
		System.out.println("せいかく：　" + pokemon.getIndividual().getNature());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
		System.out.println("出会った日：　" + sdf.format((pokemon.getBirthDate())));
		System.out.println("出会った場所：　" + pokemon.getBirthPlace());
		System.out.println("出会ったレベル：　" + pokemon.getBirthLevel());
		System.out.println("こせい：　" + pokemon.getIndividual().getPersonality()+ "\n");
	}
}
