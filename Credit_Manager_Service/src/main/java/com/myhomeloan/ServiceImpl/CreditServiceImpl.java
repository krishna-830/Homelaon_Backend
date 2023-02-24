package com.myhomeloan.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomeloan.Dao.CreditCustomerRepo;
import com.myhomeloan.Dao.CreditSanctionRepo;
import com.myhomeloan.ExceptionHandler.ResourcesNotFoundException;
import com.myhomeloan.Model.Customer;
import com.myhomeloan.Model.CustomerVarification;

import com.myhomeloan.Model.SanctionLetter;
import com.myhomeloan.Service.CreditService;

@Service
public class CreditServiceImpl implements CreditService {
	@Autowired
	private CreditCustomerRepo cusrepo;
	@Autowired
	private CreditSanctionRepo sancrepo;

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
	public SanctionLetter createSanctionLatter(SanctionLetter sl) {

		SanctionLetter sanctionLatter = sancrepo.save(sl);
		return sanctionLatter;
	}

	@Override
	public SanctionLetter getSanctionLetter(int sid) {
		return sancrepo.findById(sid).orElseThrow(()-> new ResourcesNotFoundException("No sanctionletter found with this id."));
		
		
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		CustomerVarification cusvar=new CustomerVarification();
	
		List<Customer> clist=new ArrayList<Customer>();
		//logic for set status
		for(Customer cuslist:clist)
		{
			/*
			 * if(cuslist.getEID()!=null) {
			 * 
			 * cusvar.setStatus("Procc"); }
			 */
				
		}
		
		
		
		
		
		return null;
	}

}
