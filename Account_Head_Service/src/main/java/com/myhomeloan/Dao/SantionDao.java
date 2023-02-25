package com.myhomeloan.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomeloan.model.SanctionLetter;
@Repository
public interface SantionDao extends JpaRepository<SanctionLetter, Integer>{

}
