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

import application.framework.service.IApplicationService;
import application.sample.dto.CommandInputDto;
import application.sample.dto.CommandOutputDto;

/**
 * 初期画面を表示するコントローラー
 * @author 1
 *
 */
@Controller
public class MainController {
	
	/**
	 * ロガー
	 */
	private static Log logger = LogFactory.getLog(MainController.class);

    @Autowired
    @Qualifier("MockService")
    private IApplicationService<CommandInputDto, CommandOutputDto> sampleService;
    
    @RequestMapping(value = "/", method = GET)
    public String home() {
    	logger.debug("home");
        return "forward:/menu";
    }
    
    /**
     * 初期画面を表示する
     * @return
     */
    @RequestMapping(value = "/menu", method = GET)
    public String showMenu() {
    	logger.debug("showMenu()");
        return "pokemon/menu";
    }
    
    /**
     * 戦闘開始時に呼ばれるメソッド
     * コマンド選択画面を表示する
     * @param input　
     * @param model
     * @return
     */
    @RequestMapping(value = "/battle", method = GET)
    public String showCommand(@ModelAttribute CommandInputDto input, Model model) {
    	logger.debug("showCommand()"); 	
    	CommandOutputDto output = sampleService.execute(input);
    	model.addAttribute("output", output);
        return "pokemon/battle/commandMenu";
    }
}
