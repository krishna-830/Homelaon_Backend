package com.myhomeloan.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BankAddress {

	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String cityname;
	private String areaname;
	private String district;
	private String state;
	private double pincode;
	private String streetname;

   
//alldone
}
