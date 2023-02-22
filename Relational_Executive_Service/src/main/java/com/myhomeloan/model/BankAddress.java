package com.myhomeloan.model;

<<<<<<< HEAD
import javax.persistence.Entity;
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
	private int aid;
	private String cityname;
	private String areaname;
	private String district;
	private String state;
	private double pincode;
	private String Streetname;
=======
public class BankAddress {

>>>>>>> f3488dfea21c6dd9e224253d2f4b344759f8860b
}
