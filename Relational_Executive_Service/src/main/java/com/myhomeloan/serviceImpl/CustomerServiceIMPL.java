package com.myhomeloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.myhomeloan.ExceptionHandler.ResourceNotFoundException;
import com.myhomeloan.Repository.CibilRepo;
import com.myhomeloan.Repository.CustomerRepository;
import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Customer;
import com.myhomeloan.proxyService.OEproxyService;
import com.myhomeloan.service.CustomerService;
@Service
public class CustomerServiceIMPL implements CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private OEproxyService oeproxy;
	@Autowired
	private CibilRepo cibilrepo;

	@Override
	public Customer SaveCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomerById(int eID) {
		
		return customerRepo.findById(eID).orElseThrow(()->new ResourceNotFoundException("No customer Found with this ID"));
	}

	@Override
	public void deleteCustomer(int eID) {
		
	 customerRepo.deleteById(eID);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	
		return customerRepo.save(customer);
	}
    
	@Override
	public String getallCibil() {
	 ResponseEntity<List<Cibil>> entity = oeproxy.getAllCibilStatus();
	 List<Cibil> list = entity.getBody();
	 for (Cibil cibil : list) {
		if(checkpresentCibil(cibil.getCibilId())) {
			Cibil cibilsaved = cibilrepo.save(cibil);
			if(cibilsaved.getCibilScore()>=600) {
				Customer customer=customerRepo.findById(cibilsaved.getEID()).orElseThrow(()->new ResourceNotFoundException("NO Details Found"));
			
				sendmail("sourabhbhukan09@gmail.com",customer.getEmail() , "Reply from MyHomeLoanFinance", "you are eligible for applying home loan from our bank");
			}
			else {
				throw new ResourceNotFoundException("Your CIBIL score is insufficient");
			}
		}
		else {
			
		}
	
	}
	     return "error";
	}
 
	
	
	//to check weather cibilid is present in DB already
	private boolean checkpresentCibil(int cibilId) {
		Optional<Cibil> optional = cibilrepo.findById(cibilId);
		if(optional.isPresent()) {
		  return false;
		}
		else
			return true;
	}
	
	
	@Autowired
  private MailSender sender;
  public String sendmail(String from,String to,String sub,String msg) {
	SimpleMailMessage s=new SimpleMailMessage();
	
	s.setFrom("sourabhbhukan09@gmail.com");
	s.setTo(to);
	s.setSubject(sub);
	s.setText(msg);
	
	sender.send(s);
	return "mail sent successful to:-"+to;
}

}
