package com.myhomeloan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomeloan.ExceptionHandler.ResourceNotFoundException;
import com.myhomeloan.Repository.CustomerRepository;
import com.myhomeloan.model.Customer;
import com.myhomeloan.service.CustomerService;
@Service
public class CustomerServiceIMPL implements CustomerService {
	@Autowired
	private CustomerRepository customerRepo;

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

}