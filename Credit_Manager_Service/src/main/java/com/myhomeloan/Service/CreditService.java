package com.myhomeloan.Service;


import java.util.List;

import com.myhomeloan.Model.CustomerVarification;

import com.myhomeloan.Model.SanctionLetter;

public interface CreditService {

	CustomerVarification savevarification(CustomerVarification customerVarification);

	CustomerVarification getVarification(int varId);

	String deleteVarification(int varid);

	SanctionLetter createSanctionLatter(SanctionLetter sl);

	List<SanctionLetter> getSanctionLetter();
	
	String saveCustomer();




}
