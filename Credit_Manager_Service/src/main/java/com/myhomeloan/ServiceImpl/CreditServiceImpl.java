package com.myhomeloan.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.myhomeloan.Communication.CustomerFiegn;
import com.myhomeloan.Dao.CreditCustomerRepo;
import com.myhomeloan.Dao.CreditSanctionRepo;
import com.myhomeloan.Dao.CustomerRepo;
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
    @Autowired
	private CustomerFiegn customerproxy;
    @Autowired
    private CustomerRepo custrepo;
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
	public List<SanctionLetter> getSanctionLetter() {
		return sancrepo.findAll();
	}

	


	@Override
	public String saveCustomer() {
		ResponseEntity<List<Customer>> entity = customerproxy.getAllCustomer();
		 List<Customer> clist = entity.getBody();
		 for(Customer customer :clist)
		 {
			 
			 if(checkCustomer(customer.getEID()))
			 {
				 Customer savedcustomer = custrepo.save(customer);
				 return "Ok";
			 }
			 
			 
		 }
		
		return "Not Ok";
	}

	private boolean checkCustomer(int eid) {
		
		
		Optional<Customer> id = custrepo.findById(eid);
		
		if(id.isPresent())
		{
			return false;
		}
		
		return true;
	}
	

}
