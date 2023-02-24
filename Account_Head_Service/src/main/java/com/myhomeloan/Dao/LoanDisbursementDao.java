package com.myhomeloan.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomeloan.model.LoanDisbursement;
@Repository
public interface LoanDisbursementDao extends JpaRepository<LoanDisbursement, Integer> {

}
