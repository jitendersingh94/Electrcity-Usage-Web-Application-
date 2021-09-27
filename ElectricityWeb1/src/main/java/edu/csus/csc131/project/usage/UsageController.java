package edu.csus.csc131.project.usage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usagea")
public class UsageController {
	
	@GetMapping(value="/all")
	public list<Usages>findAll(){
		usageRepository.findAll();
	}
	

}
