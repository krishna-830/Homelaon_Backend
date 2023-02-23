package com.myhomeloan.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.myhomeloan.Model.SanctionLatter;

public interface CreditSanctionRepo extends JpaRepository<SanctionLatter, Integer> {

}
