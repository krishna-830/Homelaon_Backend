package com.myhomeloan.ServiceIMPL;


import java.time.LocalDate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.myhomeloan.Communication.CreditManagerProxy;
import com.myhomeloan.Dao.LedgerDao;
import com.myhomeloan.Dao.SantionDao;
import com.myhomeloan.Service.LedgerService;
import com.myhomeloan.model.Ledger;
import com.myhomeloan.model.SanctionLetter;

@Service
public class LedgerServiceIMPL implements LedgerService {

	@Autowired
	private LedgerDao ldao;

	@Autowired
	private SantionDao sanDao;

	@Autowired
	private CreditManagerProxy cmproxy;
	

	@Override
	public Ledger createLedger(Ledger ledger) {

		return ldao.save(ledger);
	}
	
	@Override
	public List<Ledger> getAllLedger() {
		  
		return ldao.findAll();
	}


	@Override
	public List<Ledger> getAllSantionLetter() {

		ResponseEntity<List<SanctionLetter>> sanctionLetter = cmproxy.getSanctionLetter();
		List<SanctionLetter> sanclist = sanctionLetter.getBody();



		

		for (SanctionLetter letter : sanclist) {


			if (checkSanctionLetterBySid(letter.getSid())) {
			
				SanctionLetter sl = saveSantionLetter(letter);
				
				Ledger led = new Ledger();
				
				led.setLedgerCreatedDate("23-02-2023");
				led.setTotalLoanAmount(sl.getLoanAmtSanctioned());
				led.setPayableAmountwithInterest(sl.getLoanAmtSanctioned()+sl.getLoanAmtSanctioned()*1.35);
				led.setMonthlyEMI(5500);
				Ledger ledgersaved = ldao.save(led);
				
				
				
			}else {
				
			}

			

		}

		return getAllLedger();
	}

	private boolean checkSanctionLetterBySid(int sid) {
		Optional<SanctionLetter> optional = sanDao.findById(sid);

		if (optional.isPresent()) {
			return false;
		} else {

			return true;
		}

	}

	private SanctionLetter saveSantionLetter(SanctionLetter letter) {

		return sanDao.save(letter);
	}

	
}
