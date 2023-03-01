package com.myhomelaonapp.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
   @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String name;
	private String designation;
	private double salary;
	private String username;
	private String password;
	private String status;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToOne(cascade =CascadeType.ALL)
	private EmployeeBankDetails bankdetails;
	
}
