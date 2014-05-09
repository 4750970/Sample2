package application.battle.command.fight.item.service;

import org.springframework.stereotype.Component;

import application.battle.command.fight.item.dto.ItemInputDto;
import application.battle.command.fight.item.dto.ItemOutputDto;
import application.framework.service.IApplicationService;


/**
 * 技選択画面への遷移時に使用するサービス
 * @author 1
 *
 */
@Component("ItemService")
public class ItemService implements IApplicationService<ItemInputDto, ItemOutputDto> {

	public ItemOutputDto execute(ItemInputDto input){
		
		//TODO 
		System.out.println("ItemService execute");
		
		ItemOutputDto output = new ItemOutputDto();
		
		return output;
	}
}