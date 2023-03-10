package com.myhomelaonapp.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomelaonapp.Dao.AdminDao;
import com.myhomelaonapp.Model.Employee;
import com.myhomelaonapp.Service.AdminService;
@Service
public class AdminServiceIMPL implements AdminService {

	@Autowired
	private AdminDao dao;
	@Override
	public Employee addEmployee(Employee employee) {
		
		return dao.save(employee);
	}
	
	@Override
	public Employee getEmployeeByName(String username) {
	
		return dao.findByUsername(username);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		
		return dao.save(employee);
	}

	@Override
	public void deleteEmployeeByID(int empid) {
	
		dao.deleteById(empid); 
	}

	
}
