package com.myhomeloan.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.myhomeloan.Communication.CreditManagerProxy;
import com.myhomeloan.Dao.LoanDisbursementDao;
import com.myhomeloan.Service.LoanDisbursementService;
import com.myhomeloan.model.LoanDisbursement;
import com.myhomeloan.model.SanctionLetter;

@Service
public class LoanDisbursementServiceIMPL implements LoanDisbursementService {

	@Autowired
	private LoanDisbursementDao loandisDao;

	@Override
	public LoanDisbursement createLoanDisbursementFile(LoanDisbursement loan) {

		return loandisDao.save(loan);
	}

	@Override
	public List<LoanDisbursement> getAllLoanDisbursement() {
		return loandisDao.findAll();

	}

}
