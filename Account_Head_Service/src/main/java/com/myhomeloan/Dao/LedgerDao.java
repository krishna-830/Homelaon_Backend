package com.myhomeloan.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomeloan.model.Ledger;
@Repository
public interface LedgerDao extends JpaRepository<Ledger, Integer>{

}
