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
import application.sample.dto.SampleInputDto;
import application.sample.dto.SampleOutputDto;

@Controller
public class MainController {
	
	/**
	 * ロガー
	 */
	private static Log logger = LogFactory.getLog(MainController.class);

    @Autowired
    @Qualifier("MockService")
    private IApplicationService<SampleInputDto, SampleOutputDto> sampleService;
    
    /**
     * 
     * @return
     */
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
    public String startBattle(@ModelAttribute SampleInputDto input, Model model) {
    	logger.debug("startBattle()"); 	
    	SampleOutputDto output = sampleService.execute(input);
    	model.addAttribute("output", output);
        return "pokemon/battle/battleMenu";
    }
    
//    @RequestMapping(value = "/customer", method = GET)
//    public String showAllCustomers(Model model) {
//    	logger.debug("showAllCustomers()");
//        List<Customer> customers = customerService.findAll();
//        model.addAttribute("customers", customers);
//        return "customer/list";
//    }
}
