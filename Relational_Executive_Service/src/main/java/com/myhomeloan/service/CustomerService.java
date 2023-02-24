package com.myhomeloan.service;

import java.util.List;

import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Customer;


public interface CustomerService {
	Customer SaveCustomer(Customer customer);
	List<Customer> getAllCustomer();
	Customer getCustomerById(int eID);
	void deleteCustomer(int eID);
	Customer updateCustomer(Customer customer);
	List<Cibil> getallCibil();
}
