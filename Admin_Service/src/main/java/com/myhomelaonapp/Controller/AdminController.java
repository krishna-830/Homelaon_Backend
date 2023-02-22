package com.myhomelaonapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myhomelaonapp.Model.Employee;
import com.myhomelaonapp.Service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;
	
	public void loginAdmin(@PathVariable String username, @PathVariable String password) {
		
		
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
		Employee emp=service.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(emp); 
	}
	
	
	@GetMapping("/getEmployeeByName/{name}")
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable String name) {
		
		Employee emp=service.getEmployeeByName(name);
		return ResponseEntity.status(HttpStatus.CREATED).body(emp); 
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		
		Employee emp=service.updateEmployee(employee);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(emp);
	}
	
}




