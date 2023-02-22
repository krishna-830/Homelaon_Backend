package com.myhomeloan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class propertyAddress {

	@Id
	private int aid;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private double pincode;
	private String streetname;
	
}
