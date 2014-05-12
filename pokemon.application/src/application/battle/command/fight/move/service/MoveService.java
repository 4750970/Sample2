package application.battle.command.fight.move.service;

import java.util.ArrayList;
import java.util.List;

import model.monster.Pokemon;

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
		
		MoveOutputDto output = new MoveOutputDto();
		
		try{
			List<Pokemon> party = new ArrayList<Pokemon>();
			List<Pokemon> enemies = new ArrayList<Pokemon>();
			
			party = input.getParty();
			enemies = input.getEnemies();

			party.add(generator.generate());
			enemies.add(generator.generate());
			
			output.setParty(party);
			output.setEnemies(enemies);
			
		}catch(Exception e){
			e.printStackTrace();
		}

		output.setPokemon(generator.generate());
		
		return output;
	}
}