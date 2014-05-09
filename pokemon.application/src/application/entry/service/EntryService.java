package application.entry.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import application.entry.dto.EntryInputDto;
import application.entry.dto.EntryOutputDto;
import application.framework.service.IApplicationService;

@Component("EntryService")
public class EntryService implements IApplicationService<EntryInputDto, EntryOutputDto> {
	
	private static Log logger = LogFactory.getLog(EntryService.class);
	
	public EntryOutputDto execute(EntryInputDto input){
		
		logger.debug("EntryService.execute");
		
		return new EntryOutputDto();
	}
}