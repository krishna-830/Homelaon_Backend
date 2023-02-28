package com.myhomeloan.Service;

import java.util.List;

import com.myhomeloan.model.Ledger;
import com.myhomeloan.model.SanctionLetter;

public interface LedgerService {

	Ledger createLedger(Ledger ledger);

	List<Ledger> getAllSantionLetter();

	List<Ledger> getAllLedger();

}
