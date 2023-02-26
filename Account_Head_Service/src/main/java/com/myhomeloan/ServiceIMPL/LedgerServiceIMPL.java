package com.myhomeloan.ServiceIMPL;

import java.util.ArrayList;
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
	public List<SanctionLetter> getAllSantionLetter() {

		ResponseEntity<List<SanctionLetter>> sanctionLetter = cmproxy.getSanctionLetter();
		List<SanctionLetter> sanclist = sanctionLetter.getBody();

<<<<<<< HEAD

		for (SanctionLetter letter : list) {
=======
		for (SanctionLetter letter : sanclist) {
>>>>>>> 126c807d3fee4e842e151c6c8db9847fe3b613f0

			if (checkSanctionLetterBySid(letter.getSid())) {
			
				SanctionLetter savedletter = saveSantionLetter(letter);
				
				Ledger led = new Ledger();
				
				
				
				Ledger ledgersaved = ldao.save(led);
				
				
			}else {
				
			}

			

		}

		return null;
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
