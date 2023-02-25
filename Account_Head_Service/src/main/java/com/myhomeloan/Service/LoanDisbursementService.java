package com.myhomeloan.Service;

import java.util.List;

import com.myhomeloan.model.LoanDisbursement;

public interface LoanDisbursementService {

	LoanDisbursement createLoanDisbursementFile(LoanDisbursement loan);

	List<LoanDisbursement> getAllLoanDisbursement();

}
