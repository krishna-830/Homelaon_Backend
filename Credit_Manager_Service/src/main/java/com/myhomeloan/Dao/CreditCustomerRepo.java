package com.myhomeloan.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myhomeloan.Model.CustomerVarification;

public interface CreditCustomerRepo extends JpaRepository<CustomerVarification, Integer>{

}
