package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/processPension")
public class ProcessPensionController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ProcessPensionService service;
	
	@PostMapping
	PensionDetail getPensionRequest(@RequestBody ProcessPensionInput input) {
		System.out.println(input.getAadharNumber());
		
		PensionerDetail detail = restTemplate.getForObject("http://PENSIONER-DETAIL/pensionerDetailByAadhar?aadharNumber=" + input.getAadharNumber(), PensionerDetail.class);
		if(!detail.isValid()) {
			System.out.println("Not valid");
			return new PensionDetail(-1, -1);
		}
		return service.calculatePension(detail);
	}
}
