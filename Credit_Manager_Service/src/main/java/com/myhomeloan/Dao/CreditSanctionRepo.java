package com.myhomeloan.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.myhomeloan.Model.SanctionLetter;

public interface CreditSanctionRepo extends JpaRepository<SanctionLetter, Integer> {

}
