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
public class Profession {

	@Id
	private int pid;
	private String ptype;
	private double psalary;
	private String psalarytype;
	private String pworkingperiod;
	private String pDesignation;
	private byte[] psalaryslips;
=======
public class Profession {

>>>>>>> f3488dfea21c6dd9e224253d2f4b344759f8860b
}
