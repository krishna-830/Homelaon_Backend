package com.myhomeloan.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomeloan.Dao.CreditCustomerRepo;
import com.myhomeloan.Dao.CreditSanctionRepo;
import com.myhomeloan.Model.CustomerVarification;
import com.myhomeloan.Model.SanctionLatter;
import com.myhomeloan.Service.CreditService;

@Service
public class CreditServiceImpl implements CreditService {
	@Autowired
	private CreditCustomerRepo cusrepo;
	@Autowired
	private CreditSanctionRepo sanrepo;

	@Override
	public CustomerVarification savevarification(CustomerVarification customerVarification) {

		return cusrepo.save(customerVarification);
	}

	@Override
	public CustomerVarification getVarification(int varId) {
		Optional<CustomerVarification> varid = cusrepo.findById(varId);

		if (varid.isPresent()) {
			return cusrepo.findById(varId).get();
		}
		return null;
	}

	@Override
	public String deleteVarification(int varid) {
		cusrepo.deleteById(varid);
		return "Customer Varification Cancel ...";
	}

	@Override
	public SanctionLatter createSanctionLatter(SanctionLatter sl) {

		SanctionLatter sanctionLatter = sanrepo.save(sl);
		return sanctionLatter;
	}

}
