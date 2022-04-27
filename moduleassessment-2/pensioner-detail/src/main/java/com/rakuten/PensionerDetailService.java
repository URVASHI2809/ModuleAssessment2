package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class PensionerDetailService {
	
	List<PensionerDetail> details = new ArrayList<>();
	PensionerDetailService() {
		// sample data
		details.add(new PensionerDetail("Urvashi", "0987654", "098765432", 90000, 1000, "family", "private"));
		details.add(new PensionerDetail("Manisha", "1234567", "234567890", 50000, 2000, "self", "public"));
		details.add(new PensionerDetail("Lucky", "5468597", "345678090", 80000, 6000, "family", "private"));
		details.add(new PensionerDetail("Krishna", "3945678", "579854356", 75000, 3500, "self", "public"));
		
	}
	
	
	PensionerDetail getPensionerDetails(String aadharNumber) {
		List<PensionerDetail> detail = details.stream().filter(pensionDetail -> pensionDetail.getAadharNumber().equals(aadharNumber)).collect(Collectors.toList());
		if(detail.size() == 0) {
			return new PensionerDetail(false);
		}
		System.out.println(detail.get(0));
		return detail.get(0);
	}
}
