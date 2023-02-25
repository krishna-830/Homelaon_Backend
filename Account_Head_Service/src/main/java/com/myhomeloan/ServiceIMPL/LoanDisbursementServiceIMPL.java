package com.myhomeloan.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomeloan.Dao.LoanDisbursementDao;
import com.myhomeloan.Service.LoanDisbursementService;
import com.myhomeloan.model.LoanDisbursement;
@Service
public class LoanDisbursementServiceIMPL  implements LoanDisbursementService{

	@Autowired
	private LoanDisbursementDao loandisDao;
	

	@Override
	public LoanDisbursement createLoanDisbursementFile(LoanDisbursement loan) {
		
		
		return loandisDao.save(loan);
	}

}
