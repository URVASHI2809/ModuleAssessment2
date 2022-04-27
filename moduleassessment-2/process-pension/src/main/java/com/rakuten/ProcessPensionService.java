package com.rakuten;

import org.springframework.stereotype.Service;

@Service
public class ProcessPensionService {
	
	PensionDetail calculatePension(PensionerDetail detail) {
		
		float pensionAmount = 0;
		if(detail.getPensionType().equals("self")) {
			pensionAmount = (float) (detail.getSalaryEarned() * 0.8) + detail.getAllowancesAmount();
		} else {
			pensionAmount = (float) (detail.getSalaryEarned() * 0.5) + detail.getAllowancesAmount();
		}
		
		int bankCharge = 0;
		if(detail.getBankType().equalsIgnoreCase("public")) {
			bankCharge = 500;
		} else {
			bankCharge = 550;
		}
		
		PensionDetail pensionDetail = new PensionDetail(pensionAmount, bankCharge);
		
		return pensionDetail;
	}

}
