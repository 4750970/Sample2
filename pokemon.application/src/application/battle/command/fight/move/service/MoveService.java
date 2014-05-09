package application.battle.command.fight.move.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import application.battle.command.fight.move.dto.MoveInputDto;
import application.battle.command.fight.move.dto.MoveOutputDto;
import application.framework.service.IApplicationService;
import application.generator.IPokemonGenerator;


/**
 * 技選択画面への遷移時に使用するサービス
 * @author 1
 *
 */
@Component("MoveService")
public class MoveService implements IApplicationService<MoveInputDto, MoveOutputDto> {

	@Autowired
	private IPokemonGenerator generator;
	
	public MoveOutputDto execute(MoveInputDto input){
		
		//TODO 
		System.out.println("MoveService execute");
		
		MoveOutputDto output = new MoveOutputDto();
		
		output.setPokemon(generator.generate());
		
		return output;
	}
}