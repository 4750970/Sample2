package application.battle.command.fight.pokemon.service;

import org.springframework.stereotype.Component;

import application.battle.command.fight.pokemon.dto.PokemonInputDto;
import application.battle.command.fight.pokemon.dto.PokemonOutputDto;
import application.framework.service.IApplicationService;


/**
 * ポケモン選択画面への遷移時に使用するサービス
 * @author 1
 *
 */
@Component("PokemonService")
public class PokemonService implements IApplicationService<PokemonInputDto, PokemonOutputDto> {

	public PokemonOutputDto execute(PokemonInputDto input){
		
		//TODO 
		System.out.println("PokemonService execute");
		
		PokemonOutputDto output = new PokemonOutputDto();
		
		return output;
	}
}