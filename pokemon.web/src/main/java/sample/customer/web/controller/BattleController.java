package sample.customer.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import application.battle.command.dto.CommandInputDto;
import application.battle.command.dto.CommandOutputDto;
import application.battle.command.fight.item.dto.ItemInputDto;
import application.battle.command.fight.item.dto.ItemOutputDto;
import application.battle.command.fight.move.dto.MoveInputDto;
import application.battle.command.fight.move.dto.MoveOutputDto;
import application.battle.command.fight.pokemon.dto.PokemonInputDto;
import application.battle.command.fight.pokemon.dto.PokemonOutputDto;
import application.battle.dto.InputDto;
import application.battle.dto.OutputDto;
import application.framework.service.IApplicationService;

@Controller
public class BattleController {
	
	/**
	 * ロガー
	 */
	private static Log logger = LogFactory.getLog(BattleController.class);
    
	//TODO
//    @Autowired
//    @Qualifier("Service1")
//    private IApplicationService<InputDto, OutputDto> service;
	
    @Autowired
    @Qualifier("MoveService")
    private IApplicationService<MoveInputDto, MoveOutputDto> moveService;
    
    @Autowired
    @Qualifier("CommandService")
    private IApplicationService<CommandInputDto, CommandOutputDto> commandService;

    @Autowired
    @Qualifier("PokemonService")
    private IApplicationService<PokemonInputDto, PokemonOutputDto> pokemonService;

    @Autowired
    @Qualifier("ItemService")
    private IApplicationService<ItemInputDto, ItemOutputDto> itemService;
    
    /**
     * 「たたかう」コマンド選択時に呼ばれるメソッド
     * 技選択画面を表示する
     * @return
     */
    @RequestMapping(value = "/fight", method = GET)
    public String showMove(@ModelAttribute MoveInputDto input, Model model) {
    	    	
    	logger.debug("showMove()"); 
    	
    	MoveOutputDto output = moveService.execute(input);
  	
    	model.addAttribute("output", output);
    	
        return "pokemon/battle/moveMenu";
    }
 
    
    
    
    
    
    
    /**
     * 「ポケモン」コマンド選択時に呼ばれるメソッド
     * ポケモン選択画面を表示する
     * @return
     */
    @RequestMapping(value = "/pokemon", method = GET)
    public String pokemon(@ModelAttribute PokemonInputDto input, Model model) {
    	logger.debug("pokemon()"); 	
    	
    	PokemonOutputDto output = pokemonService.execute(input);
    	
        return "pokemon/battle/pokemonMenu";
    }
   
    /**
     * 「バッグ」コマンド選択時に呼ばれるメソッド
     * アイテム選択画面を表示する
     * @return
     */
    @RequestMapping(value = "/bag", method = GET)
    public String bag(@ModelAttribute ItemInputDto input, Model model) {
    	logger.debug("bag()"); 	
    	
    	ItemOutputDto output = itemService.execute(input);
    	
        return "pokemon/battle/itemMenu";
    }
    
    /**
     * 「にげる」コマンド選択時に呼ばれるメソッド
     * ポケモン選択画面を表示する
     * @return
     */
    @RequestMapping(value = "/run", method = GET)
    public String run() {
    	logger.debug("run()"); 	
    	//TODO
    	System.out.println("逃げ出した");
        return "pokemon/menu";
    }
    
    /**
     * 「わざ」コマンド選択時に呼ばれるメソッド
     * 技の実行結果に応じて異なる画面を表示する
     * 
     * 相手のポケモンが瀕死⇒戦闘結果画面
     * 相手のポケモンが瀕死でない⇒コマンド選択画面
     * @return
     */
    @RequestMapping(value = "/move", method = GET)
    public String move(@ModelAttribute CommandInputDto input, Model model) {
    	logger.debug("実験！");
    	
    	CommandOutputDto output = commandService.execute(input);
    	
    	model.addAttribute("output", output);
    	
    	return "pokemon/battle/battleMenu";
    	
    	//TODO 戦闘結果に応じて遷移先を切り替える
//    	if(true){
//    		return "pokemon/battle/battleMenu";
//    	}else{
//    		//return "pokemon/battle/result";
//    	}
        
    }
    

    

}

