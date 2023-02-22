package com.myhomelaonapp.Service;

import com.myhomelaonapp.Model.Employee;

public interface AdminService {

	Employee addEmployee(Employee employee);

	Employee getEmployeeByName(String name);

	Employee updateEmployee(Employee employee);

}
