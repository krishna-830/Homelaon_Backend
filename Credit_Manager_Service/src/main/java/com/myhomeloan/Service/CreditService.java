package com.myhomeloan.Service;

import com.myhomeloan.Model.CustomerVarification;
import com.myhomeloan.Model.SanctionLatter;

public interface CreditService {

	CustomerVarification savevarification(CustomerVarification customerVarification);

	CustomerVarification getVarification(int varId);

	String deleteVarification(int varid);

	SanctionLatter createSanctionLatter(SanctionLatter sl);

	SanctionLatter getSanctionLetter(int sid);




}
