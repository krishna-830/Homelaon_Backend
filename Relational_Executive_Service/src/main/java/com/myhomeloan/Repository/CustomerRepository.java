package com.myhomeloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myhomeloan.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
