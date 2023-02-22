package com.myhomeloan.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomeloan.model.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Integer>  {

}
