package com.myhomeloan.service;

import java.util.List;

import com.myhomeloan.dto.CustomerDTO;
import com.myhomeloan.model.Customer;


public interface CustomerService {
	Customer SaveCustomer(CustomerDTO customer);
	List<Customer> getAllCustomer();
	Customer getCustomerById(int eID);
	void deleteCustomer(int eID);
	Customer updateCustomer(Customer customer);
	String getallCibil();

	Customer findByEID(int eID);
	Customer SaveCustomerwithDocument(Customer customer);

}
