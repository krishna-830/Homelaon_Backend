package com.myhomeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomeloan.model.Cibil;

@Repository
public interface CibilRepository extends JpaRepository<Cibil, Integer>{

}
