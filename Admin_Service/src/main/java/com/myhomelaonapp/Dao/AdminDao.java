package com.myhomelaonapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomelaonapp.Model.Employee;
@Repository
public interface AdminDao extends JpaRepository<Employee, Integer> {

	

	Employee findByUsername(String username);



}
