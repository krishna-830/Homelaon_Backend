package com.myhomelaonapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myhomelaonapp.Model.Employee;
import com.myhomelaonapp.Service.AdminService;

@RestController
@RequestMapping("admin-api")
public class AdminController {

	@Autowired
	private AdminService service;

	@PostMapping("/adminlogin")
	public ResponseEntity<String> loginAdmin(@RequestParam String username, @RequestParam String password) {
		
		ResponseEntity<Employee> emp = getEmployeeByName(username);
		Employee employee = emp.getBody();
		if(username.equals(employee.getUsername()) && password.equals(employee.getPassword())) {
			return ResponseEntity.status(HttpStatus.FOUND).body("login successful") ;
		}else return ResponseEntity.status(HttpStatus.FOUND).body("Failed");
		
		
	}

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

		Employee emp = service.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(emp);
	}

	@GetMapping("/getEmployeeByName/{username}")
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable String username) {

		Employee emp = service.getEmployeeByName(username);
		return ResponseEntity.status(HttpStatus.CREATED).body(emp);
	}

	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {

		Employee emp = service.updateEmployee(employee);

		return ResponseEntity.status(HttpStatus.CREATED).body(emp);
	}

	@DeleteMapping("/deleteEmployeeByID/{empid}")
	public ResponseEntity<String> deleteEmployeeByID(@PathVariable int empid) {

		 service.deleteEmployeeByID(empid);
		return ResponseEntity.status(HttpStatus.OK).body("DELETED");
	}

}
