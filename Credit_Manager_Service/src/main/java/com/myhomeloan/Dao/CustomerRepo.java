package com.myhomeloan.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myhomeloan.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
