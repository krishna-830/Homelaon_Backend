package com.myhomeloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myhomeloan.ExceptionHandler.ResourceNotFoundException;
import com.myhomeloan.Repository.CibilRepo;
import com.myhomeloan.Repository.CustomerRepository;
import com.myhomeloan.Repository.EnquiryRepository;
import com.myhomeloan.dto.CustomerDTO;
import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Customer;
import com.myhomeloan.model.Enquiry_Details;
import com.myhomeloan.proxyService.OEproxyService;
import com.myhomeloan.service.CustomerService;
@Service
public class CustomerServiceIMPL implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private EnquiryRepository enqrRepo;
	@Autowired
	private OEproxyService oeproxy;
	@Autowired
	private CibilRepo cibilrepo;
	@Autowired
    private ModelMapper mapper;
	@Override
	public Customer SaveCustomer(CustomerDTO customer) {
		
		
		  // logic to convert CustomerDto to Customer
		Customer cust = mapper.map(customer,Customer.class);
		
		return customerRepo.save(cust);
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
		System.out.println("insside cibil");
	 List<Cibil> entity = oeproxy.getAllCibilStatuses();
	 System.out.println();
	 //System.out.println(entity.getBody());
	 List<Cibil> list = entity;
	 System.out.println(list);
	 for (Cibil cibil : list) {
		if(checkpresentCibil(cibil.getCibilId())) {
			Cibil cibilsaved = cibilrepo.save(cibil);
			if(cibilsaved.getCibilScore()>=600) {
				System.out.println("saved cibil");
				System.out.println(cibilsaved.getEid());
			
				Enquiry_Details eqn = enqrRepo.findById(cibilsaved.getEid()).orElseThrow(()-> new ResourceNotFoundException("No Enquiry Found With this Id"));
				
				sendmail("sourabhbhukan09@gmail.com",eqn.getEmail() , "Reply from MyHomeLoanFinance", "you are eligible for applying home loan from our bank");
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


@Override
public Customer findByEID(int eID) {
	
	return customerRepo.findById(eID).orElseThrow(()->new ResourceNotFoundException("No Customer with this ID"));
}

@Override
public Customer SaveCustomerwithDocument(Customer customer) {
	return customerRepo.save(customer);
	
}

}
