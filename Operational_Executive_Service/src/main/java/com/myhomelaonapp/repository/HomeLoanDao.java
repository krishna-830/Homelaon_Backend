package com.myhomelaonapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myhomeloanapp.model.Cibil;


public interface HomeLoanDao extends JpaRepository<Cibil, Integer>{

}
