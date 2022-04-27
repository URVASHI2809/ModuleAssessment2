package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PensionDetailController {
	
	@Autowired
	PensionerDetailService service;
	
	@GetMapping("/pensionerDetailByAadhar")
	PensionerDetail getPensionerDetail(@RequestParam String aadharNumber) {
		System.out.println(aadharNumber);
		return service.getPensionerDetails(aadharNumber);
	}
}
