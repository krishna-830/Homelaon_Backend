package com.myhomeloan.ServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<SanctionLetter> getAllSantionLetter() {

		ArrayList<SanctionLetter> list = new ArrayList<SanctionLetter>();


		for (SanctionLetter letter : list) {

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

		return null;
	}

}
